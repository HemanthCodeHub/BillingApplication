package com.example.calculator.model;

import java.util.Objects;

public class Bill {

    private final CustomerType customerType;
    private final double totalPurchaseAmount;
    private final double totalBillAfterDiscount;
    private final double totalDiscount;

    public Bill(CustomerType customerType, double totalPurchaseAmount, double totalDiscount, double totalBillAfterDiscount) {
        this.customerType = customerType;
        this.totalPurchaseAmount = totalPurchaseAmount;
        this.totalDiscount = totalDiscount;
        this.totalBillAfterDiscount = totalBillAfterDiscount;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public double getTotalPurchaseAmount() {
        return totalPurchaseAmount;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public double getTotalBillAfterDiscount() {
        return totalBillAfterDiscount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill bill = (Bill) o;
        return Double.compare(bill.totalPurchaseAmount, totalPurchaseAmount) == 0 && Double.compare(bill.totalBillAfterDiscount, totalBillAfterDiscount) == 0 && Double.compare(bill.totalDiscount, totalDiscount) == 0 && customerType == bill.customerType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerType, totalPurchaseAmount, totalBillAfterDiscount, totalDiscount);
    }

    @Override
    public String toString() {
        return "Bill{" +
                "customerType=" + customerType +
                ", totalPurchaseAmount=" + totalPurchaseAmount +
                ", totalBillAfterDiscount=" + totalBillAfterDiscount +
                ", totalDiscount=" + totalDiscount +
                '}';
    }
}
