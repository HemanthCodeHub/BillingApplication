package com.example.calculator.service;

import com.example.calculator.model.Bill;
import com.example.calculator.model.CustomerType;
import com.example.calculator.util.DiscountCalculator;
import org.springframework.stereotype.Service;

@Service
public class BillingService {

    public Bill calculateFinalBill(CustomerType customerType, double totalPurchaseAmount) {
        DiscountCalculator discountCalculator = DiscountCalculator.of(customerType);
        double discount = discountCalculator.calculateDiscount(totalPurchaseAmount);
        return new Bill(customerType, totalPurchaseAmount, discount, totalPurchaseAmount - discount);
    }
}
