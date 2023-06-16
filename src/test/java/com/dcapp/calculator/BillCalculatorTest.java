package com.dcapp.calculator;

import com.dcapp.model.CustomerType;
import org.junit.Assert;
import org.junit.Test;

public class BillCalculatorTest {

    @Test
    public void testRegularCustomerBillWhenAmountIsLessThanZero() {
        BillCalculator calculator = new BillCalculator(CustomerType.REGULAR);
        Assert.assertEquals(-1, calculator.calculateFinalBill(-1), 0);
    }

    @Test
    public void testRegularCustomerBillWhenAmountIsZeroTo5000() {
        BillCalculator calculator = new BillCalculator(CustomerType.REGULAR);
        Assert.assertEquals(5000, calculator.calculateFinalBill(5000), 0);
    }

    @Test
    public void testRegularCustomerBillWhenAmountIsMoreThan5000() {
        BillCalculator calculator = new BillCalculator(CustomerType.REGULAR);
        Assert.assertEquals(9500, calculator.calculateFinalBill(10000), 0);
        Assert.assertEquals(13500, calculator.calculateFinalBill(15000), 0);
    }

    @Test
    public void testPremiumCustomerBillWhenAmountIsLessThanZero() {
        BillCalculator calculator = new BillCalculator(CustomerType.PREMIUM);
        Assert.assertEquals(-1, calculator.calculateFinalBill(-1), 0);
    }

    @Test
    public void testPremiumCustomerBillWhenAmountIsZeroTo4000() {
        BillCalculator calculator = new BillCalculator(CustomerType.PREMIUM);
        Assert.assertEquals(3600, calculator.calculateFinalBill(4000), 0);
    }

    @Test
    public void testPremiumCustomerBillWhenAmountIsMoreThan4000() {
        BillCalculator calculator = new BillCalculator(CustomerType.PREMIUM);
        Assert.assertEquals(7000, calculator.calculateFinalBill(8000), 0);
        Assert.assertEquals(10200, calculator.calculateFinalBill(12000), 0);
        Assert.assertEquals(15800, calculator.calculateFinalBill(20000), 0);
    }
}