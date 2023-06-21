package com.example.calculator.repository;

import com.example.calculator.model.Customer;
import com.example.calculator.model.CustomerType;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CustomerRepository {

    private static final Map<Integer, Customer> map = new HashMap<>();

    static {
        // This is static list of customer, we can always create a controller to accept the
        // customer data and update the customers map. We can also extend it to save it
        // in database or to call another service to handle it on our behalf.
        map.put(1, new Customer(1, "Tom", CustomerType.REGULAR));
        map.put(2, new Customer(2, "Alex", CustomerType.PREMIUM));
    }

    public boolean isPresent(int id) {
        return map.containsKey(id);
    }

    public Customer getCustomerById(int id) {
        return map.get(id);
    }
}
