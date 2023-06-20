package com.example.calculator.util;

import org.springframework.stereotype.Service;

@Service("RegularDiscountCalculator")
public class RegularDiscountCalculator implements DiscountCalculator {
    @Override
    public double calculateDiscount(double totalPurchaseAmount) {
        double totalDiscount = 0;
        if (totalPurchaseAmount > 10000) {
            double diffAmount = totalPurchaseAmount - 10000;
            totalDiscount += diffAmount * 0.2;
            totalPurchaseAmount -= diffAmount;
        }
        if (totalPurchaseAmount > 5000) {
            double diffAmount = totalPurchaseAmount - 5000;
            totalDiscount += diffAmount * 0.1;
        }
        return totalDiscount;
    }
}
