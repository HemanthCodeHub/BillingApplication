package com.dcapp.calculator;

import com.dcapp.model.CustomerType;

public class BillCalculator {

    private final CustomerType customerType;

    public BillCalculator(CustomerType customerType) {
        this.customerType = customerType;
    }

    public double calculateFinalBill(double totalPurchaseAmount) {
        DiscountCalculator discountCalculator = DiscountCalculator.of(customerType);
        double discount = discountCalculator.calculateDiscount(totalPurchaseAmount);
        return totalPurchaseAmount - discount;
    }
}
