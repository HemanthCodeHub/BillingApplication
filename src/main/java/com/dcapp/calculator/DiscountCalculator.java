package com.dcapp.calculator;

import com.dcapp.model.CustomerType;

public interface DiscountCalculator {

    double calculateDiscount(double totalPurchaseAmount);

    static DiscountCalculator of(CustomerType customerType) {
        DiscountCalculator discountCalculator = null;

        switch (customerType) {
            case REGULAR:
                discountCalculator = new RegularDiscountCalculator();
                break;
            case PREMIUM:
                discountCalculator = new PremiumDiscountCalculator();
                break;
        }

        return discountCalculator;
    }

}
