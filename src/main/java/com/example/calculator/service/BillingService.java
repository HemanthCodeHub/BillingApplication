package com.example.calculator.service;

import com.example.calculator.model.Bill;
import com.example.calculator.model.Customer;
import com.example.calculator.model.CustomerType;
import com.example.calculator.model.Transaction;
import com.example.calculator.repository.CustomerRepository;
import com.example.calculator.repository.TransactionRepository;
import com.example.calculator.util.DiscountCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    public Bill getFinalBill(int customerId) {
        Customer customer = customerRepository.getCustomerById(customerId);

        if (customer != null) {
            List<Transaction> transactions = transactionRepository.getTransactionsByCustomerId(customerId);
            DiscountCalculator discountCalculator = DiscountCalculator.of(customer.getCustomerType());

            double totalPurchaseAmount = transactions.stream().mapToDouble(Transaction::getTransactionAmount).sum();
            double discount = discountCalculator.calculateDiscount(totalPurchaseAmount);
            return new Bill(customer, totalPurchaseAmount, discount, totalPurchaseAmount - discount);
        }

        return null;
    }

}
