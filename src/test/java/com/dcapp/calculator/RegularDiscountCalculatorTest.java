package com.dcapp.calculator;

import org.junit.Assert;
import org.junit.Test;

public class RegularDiscountCalculatorTest {

    @Test
    public void testDiscountWhenAmountIsLessThanZero() {
        RegularDiscountCalculator calculator = new RegularDiscountCalculator();
        double discount = calculator.calculateDiscount(-1);
        Assert.assertEquals(0, discount, 0);
    }

    @Test
    public void testDiscountWhenAmountIsZeroTo5000() {
        RegularDiscountCalculator calculator = new RegularDiscountCalculator();
        double discount = calculator.calculateDiscount(5000);
        Assert.assertEquals(0, discount, 0);
    }

    @Test
    public void testDiscountWhenAmountIsMoreThan5000() {
        RegularDiscountCalculator calculator = new RegularDiscountCalculator();
        Assert.assertEquals(500, calculator.calculateDiscount(10000), 0);
        Assert.assertEquals(1500, calculator.calculateDiscount(15000), 0);
    }

}