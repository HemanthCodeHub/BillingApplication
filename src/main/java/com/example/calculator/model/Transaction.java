package com.example.calculator.model;

import java.util.Objects;

public class Transaction {

    // Primary Key
    private int id;
    private int customerId;
    private double transactionAmount;

    public Transaction(int transactionId, int customerId, double transactionAmount) {
        this.id = transactionId;
        this.customerId = customerId;
        this.transactionAmount = transactionAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return id == that.id && customerId == that.customerId && Double.compare(that.transactionAmount, transactionAmount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerId, transactionAmount);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + id +
                ", customerId=" + customerId +
                ", transactionAmount=" + transactionAmount +
                '}';
    }
}
