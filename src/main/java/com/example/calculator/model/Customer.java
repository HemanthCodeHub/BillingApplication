package com.example.calculator.model;

import java.util.Objects;

public class Customer {

    private int id;
    private String name;
    private CustomerType customerType;

    public Customer(int id, String name, CustomerType customerType) {
        this.id = id;
        this.name = name;
        this.customerType = customerType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(name, customer.name) && customerType == customer.customerType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, customerType);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", customerType=" + customerType +
                '}';
    }
}
