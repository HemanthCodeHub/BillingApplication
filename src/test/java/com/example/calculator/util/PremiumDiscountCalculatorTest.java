package com.example.calculator.util;

import com.example.calculator.util.PremiumDiscountCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PremiumDiscountCalculatorTest {

    @Test
    public void testDiscountWhenAmountIsLessThanZero() {
        PremiumDiscountCalculator calculator = new PremiumDiscountCalculator();
        double discount = calculator.calculateDiscount(-1);
        assertEquals(0, discount, 0);
    }

    @Test
    public void testDiscountWhenAmountIsZeroTo4000() {
        PremiumDiscountCalculator calculator = new PremiumDiscountCalculator();
        double discount = calculator.calculateDiscount(4000);
        assertEquals(400, discount, 0);
    }

    @Test
    public void testDiscountWhenAmountIsMoreThan4000() {
        PremiumDiscountCalculator calculator = new PremiumDiscountCalculator();
        assertEquals(1000, calculator.calculateDiscount(8000), 0);
        assertEquals(1800, calculator.calculateDiscount(12000), 0);
        assertEquals(4200, calculator.calculateDiscount(20000), 0);
    }
}