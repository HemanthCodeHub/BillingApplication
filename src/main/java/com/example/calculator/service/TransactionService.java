package com.example.calculator.service;

import com.example.calculator.model.Transaction;
import com.example.calculator.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository repository;

    public boolean addTransaction(Transaction transaction) {
        return repository.addTransaction(transaction);
    }

    public List<Transaction> getTransactions(int customerId) {
        return repository.getTransactionsByCustomerId(customerId);
    }
}
