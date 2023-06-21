package com.example.calculator.controller;

import com.example.calculator.model.Bill;
import com.example.calculator.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillingController {

    @Autowired
    private BillingService billingService;

    @GetMapping(value = "/billing/{customerId}", produces = "application/json")
    public ResponseEntity<Bill> getFinalBill(@PathVariable int customerId) {
        return ResponseEntity.ok(billingService.getFinalBill(customerId));
    }

}
