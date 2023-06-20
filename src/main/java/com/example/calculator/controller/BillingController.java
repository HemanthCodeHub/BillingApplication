package com.example.calculator.controller;

import com.example.calculator.model.Bill;
import com.example.calculator.model.CustomerType;
import com.example.calculator.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillingController {

    @Autowired
    private BillingService billingService;

    @GetMapping(value = "/billing", produces = "application/json")
    public ResponseEntity<Bill> getRewardByCustomerId(@RequestParam CustomerType customerType, @RequestParam int totalPurchaseAmount) {
        return ResponseEntity.ok(billingService.calculateFinalBill(customerType, totalPurchaseAmount));
    }

}
