package com.example.calculator.controller;

import com.example.calculator.model.Transaction;
import com.example.calculator.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping(value = "/transactions", produces = "application/json")
    public ResponseEntity<Boolean> addTransaction(@RequestBody Transaction transaction) {
        return ResponseEntity.ok(transactionService.addTransaction(transaction));
    }

    @GetMapping(value = "/transactions/customer/{customerId}", produces = "application/json")
    public ResponseEntity<List<Transaction>> addTransaction(@PathVariable int customerId) {
        return ResponseEntity.ok(transactionService.getTransactions(customerId));
    }
}
