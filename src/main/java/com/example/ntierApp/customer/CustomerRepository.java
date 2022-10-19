package com.example.ntierApp.customer;

import java.util.Arrays;
import java.util.List;

//@Repository
public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomer() {
        // TODO connect to real db
        return Arrays.asList(
                new Customer(1l, "TODO. Implement real db", "todo")
        );
    }
}
