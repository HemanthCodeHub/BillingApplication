package com.example.calculator.service;

import com.example.calculator.model.Bill;
import com.example.calculator.model.CustomerType;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig
public class BillingServiceTest {

    @InjectMocks
    private BillingService billingService;

    @Test
    public void testRegularCustomerBillWhenAmountIsLessThanZero() {
        Bill expected = new Bill(CustomerType.REGULAR, -1, 0, -1);
        assertEquals(expected, billingService.calculateFinalBill(CustomerType.REGULAR, -1));
    }

    @Test
    public void testRegularCustomerBillWhenAmountIsZeroTo5000() {
        Bill expected = new Bill(CustomerType.REGULAR, 5000, 0, 5000);
        assertEquals(expected, billingService.calculateFinalBill(CustomerType.REGULAR, 5000));
    }

    @Test
    public void testRegularCustomerBillWhenAmountIsMoreThan5000() {
        Bill expected = new Bill(CustomerType.REGULAR, 10000, 500, 9500);
        assertEquals(expected, billingService.calculateFinalBill(CustomerType.REGULAR, 10000));

        expected = new Bill(CustomerType.REGULAR, 15000, 1500, 13500);
        assertEquals(expected, billingService.calculateFinalBill(CustomerType.REGULAR, 15000));
    }

    @Test
    public void testPremiumCustomerBillWhenAmountIsLessThanZero() {
        Bill expected = new Bill(CustomerType.PREMIUM, -1, 0, -1);
        assertEquals(expected, billingService.calculateFinalBill(CustomerType.PREMIUM, -1));
    }

    @Test
    public void testPremiumCustomerBillWhenAmountIsZeroTo4000() {
        Bill expected = new Bill(CustomerType.PREMIUM, 4000, 400, 3600);
        assertEquals(expected, billingService.calculateFinalBill(CustomerType.PREMIUM, 4000));
    }

    @Test
    public void testPremiumCustomerBillWhenAmountIsMoreThan4000() {
        Bill expected = new Bill(CustomerType.PREMIUM, 8000, 1000, 7000);
        assertEquals(expected, billingService.calculateFinalBill(CustomerType.PREMIUM, 8000));

        expected = new Bill(CustomerType.PREMIUM, 12000, 1800, 10200);
        assertEquals(expected, billingService.calculateFinalBill(CustomerType.PREMIUM, 12000));

        expected = new Bill(CustomerType.PREMIUM, 20000, 4200, 15800);
        assertEquals(expected, billingService.calculateFinalBill(CustomerType.PREMIUM, 20000));
    }
}