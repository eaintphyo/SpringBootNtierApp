package com.example.ntierApp.customer;

import java.util.Arrays;
import java.util.List;

//@Repository(value = "fake")
public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomer() {
        return Arrays.asList(
                new Customer(1l, "James Bond", "password123", "email@gmail.com"),
                new Customer(2l, "Jamila Ahmed", "123password", "email@gmail.com")
        );
    }
}
