package com.example.calculator.model;

import java.util.Objects;

public class Bill {

    private Customer customer;
    private final double totalPurchaseAmount;
    private final double totalBillAfterDiscount;
    private final double totalDiscount;

    public Bill(Customer customer, double totalPurchaseAmount, double totalDiscount, double totalBillAfterDiscount) {
        this.customer = customer;
        this.totalPurchaseAmount = totalPurchaseAmount;
        this.totalDiscount = totalDiscount;
        this.totalBillAfterDiscount = totalBillAfterDiscount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getTotalPurchaseAmount() {
        return totalPurchaseAmount;
    }

    public double getTotalBillAfterDiscount() {
        return totalBillAfterDiscount;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill bill = (Bill) o;
        return Double.compare(bill.totalPurchaseAmount, totalPurchaseAmount) == 0 && Double.compare(bill.totalBillAfterDiscount, totalBillAfterDiscount) == 0 && Double.compare(bill.totalDiscount, totalDiscount) == 0 && Objects.equals(customer, bill.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer, totalPurchaseAmount, totalBillAfterDiscount, totalDiscount);
    }

    @Override
    public String toString() {
        return "Bill{" +
                "customer=" + customer +
                ", totalPurchaseAmount=" + totalPurchaseAmount +
                ", totalBillAfterDiscount=" + totalBillAfterDiscount +
                ", totalDiscount=" + totalDiscount +
                '}';
    }
}
