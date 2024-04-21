package com.spring.learn.Springlearnlombok.service;

import com.spring.learn.Springlearnlombok.model.Customer;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private List<Customer> customerList = new ArrayList<>();

    public CustomerServiceImpl() {

        Customer aman = new Customer("aman", 1, "V2", new Date(2014, 02, 11), new Date(2024, 04, 21));
        Customer vijay = new Customer("vijay", 2, "V5", new Date(2016, 07, 15), new Date(2024, 01, 2));
        Customer anil = new Customer("anil", 3, "V6", new Date(2019, 01, 24), new Date(2024, 03, 8));

        customerList.add(aman);
        customerList.add(vijay);
        customerList.add(anil);

    }


    @Override
    public List<Customer> getAllCustomer() {

        return customerList;
    }

    @Override
    public Customer getCustomerById(Integer id) {

        return customerList.get(id);
    }
}
