package com.spring.learn.Springlearnlombok.service;

import com.spring.learn.Springlearnlombok.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomer();
    Customer getCustomerById(Integer id);
}
