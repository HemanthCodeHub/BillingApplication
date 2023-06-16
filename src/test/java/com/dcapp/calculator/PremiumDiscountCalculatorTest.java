package com.dcapp.calculator;

import org.junit.Assert;
import org.junit.Test;

public class PremiumDiscountCalculatorTest {

    @Test
    public void testDiscountWhenAmountIsLessThanZero() {
        PremiumDiscountCalculator calculator = new PremiumDiscountCalculator();
        double discount = calculator.calculateDiscount(-1);
        Assert.assertEquals(0, discount, 0);
    }

    @Test
    public void testDiscountWhenAmountIsZeroTo4000() {
        PremiumDiscountCalculator calculator = new PremiumDiscountCalculator();
        double discount = calculator.calculateDiscount(4000);
        Assert.assertEquals(400, discount, 0);
    }

    @Test
    public void testDiscountWhenAmountIsMoreThan4000() {
        PremiumDiscountCalculator calculator = new PremiumDiscountCalculator();
        Assert.assertEquals(1000, calculator.calculateDiscount(8000), 0);
        Assert.assertEquals(1800, calculator.calculateDiscount(12000), 0);
        Assert.assertEquals(4200, calculator.calculateDiscount(20000), 0);
    }
}