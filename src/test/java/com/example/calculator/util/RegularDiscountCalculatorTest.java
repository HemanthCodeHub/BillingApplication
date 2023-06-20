package com.example.calculator.util;

import com.example.calculator.util.RegularDiscountCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegularDiscountCalculatorTest {

    @Test
    public void testDiscountWhenAmountIsLessThanZero() {
        RegularDiscountCalculator calculator = new RegularDiscountCalculator();
        double discount = calculator.calculateDiscount(-1);
        assertEquals(0, discount, 0);
    }

    @Test
    public void testDiscountWhenAmountIsZeroTo5000() {
        RegularDiscountCalculator calculator = new RegularDiscountCalculator();
        double discount = calculator.calculateDiscount(5000);
        assertEquals(0, discount, 0);
    }

    @Test
    public void testDiscountWhenAmountIsMoreThan5000() {
        RegularDiscountCalculator calculator = new RegularDiscountCalculator();
        assertEquals(500, calculator.calculateDiscount(10000), 0);
        assertEquals(1500, calculator.calculateDiscount(15000), 0);
    }

}