package com.spring.learn.Springlearnlombok.controller;

import com.spring.learn.Springlearnlombok.model.Customer;
import com.spring.learn.Springlearnlombok.service.CustomerService;
import com.spring.learn.Springlearnlombok.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.invoke.MethodType;
import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("api/v1/customer/")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity createACustomer(@RequestBody Customer customer) {
        Customer savedCust = customerService.SaveCustomer(customer);

        HttpHeaders headers = new HttpHeaders();
        headers.add("fileLocation",savedCust.getId().toString());
        return new ResponseEntity<>(headers,HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> getAllCustomers() {

        return customerService.getAllCustomer();
    }

    @RequestMapping(value = "/{custId}",method = RequestMethod.GET)
    public Customer getCustomerById(@PathVariable("custId") UUID id) {
        return customerService.getCustomerById(id);
    }

}
