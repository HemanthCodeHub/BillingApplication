package com.example.calculator.repository;

import com.example.calculator.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TransactionRepository {

    private static final Map<Integer, List<Transaction>> transactionMap = new HashMap<>();
    private static final Random random = new Random();

    @Autowired
    private CustomerRepository customerRepository;

    public boolean addTransaction(Transaction transaction) {
        int customerId = transaction.getCustomerId();
        // Add transaction only if it is a valid customer.
        if (customerRepository.isPresent(customerId)) {
            transaction.setId(random.nextInt(100000000));
            List<Transaction> transactions = transactionMap.getOrDefault(customerId, new ArrayList<>());
            transactions.add(transaction);
            transactionMap.put(customerId, transactions);
            return true;
        }

        return false;
    }

    public List<Transaction> getTransactionsByCustomerId(int customerId) {
        return transactionMap.getOrDefault(customerId, null);
    }

}
