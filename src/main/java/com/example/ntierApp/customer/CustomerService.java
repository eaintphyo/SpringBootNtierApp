package com.example.ntierApp.customer;

import com.example.ntierApp.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private CustomerRepo customerRepo;

    @Autowired
    public CustomerService
            (CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomers() {
        return customerRepo.getCustomer();
    }

    Customer getCustomer( Long id) {
        return getCustomers()
                .stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .orElseThrow(
                        () -> new NotFoundException(
                                "customer with id "+ id +" not found"));
    }
}
