package com.example.calculator.util;

public class PremiumDiscountCalculator implements DiscountCalculator {
    @Override
    public double calculateDiscount(double totalPurchaseAmount) {
        double totalDiscount = 0;
        if (totalPurchaseAmount > 12000) {
            double diffAmount = totalPurchaseAmount - 12000;
            totalDiscount += diffAmount * 0.3;
            totalPurchaseAmount -= diffAmount;
        }
        if (totalPurchaseAmount > 8000) {
            double diffAmount = totalPurchaseAmount - 8000;
            totalDiscount += diffAmount * 0.2;
            totalPurchaseAmount -= diffAmount;
        }
        if (totalPurchaseAmount > 4000) {
            double diffAmount = totalPurchaseAmount - 4000;
            totalDiscount += diffAmount * 0.15;
            totalPurchaseAmount -= diffAmount;
        }
        if (totalPurchaseAmount > 0) {
            double diffAmount = totalPurchaseAmount - 0;
            totalDiscount += diffAmount * 0.1;
        }
        return totalDiscount;
    }
}
