package com.spring.learn.Springlearnlombok.controller;

import com.spring.learn.Springlearnlombok.model.Customer;
import com.spring.learn.Springlearnlombok.service.CustomerService;
import com.spring.learn.Springlearnlombok.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodType;
import java.util.List;


@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> getAllCustomers() {

        return customerService.getAllCustomer();
    }

    @RequestMapping(value = "/{custId}",method = RequestMethod.GET)
    public Customer getCustomerById(@PathVariable("custId") Integer id) {
        return customerService.getCustomerById(1);
    }

}
