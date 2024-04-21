package com.spring.learn.Springlearnlombok.service;

import com.spring.learn.Springlearnlombok.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {

    List<Customer> getAllCustomer();
    Customer getCustomerById(UUID id);

    Customer SaveCustomer(Customer customer);
}
