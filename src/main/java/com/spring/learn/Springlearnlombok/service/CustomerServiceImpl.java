package com.spring.learn.Springlearnlombok.service;

import com.spring.learn.Springlearnlombok.model.Customer;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private List<Customer> customerList = new ArrayList<>();

    public CustomerServiceImpl() {

        Customer aman = new Customer("aman", 1, "V2", LocalDate.now(), LocalDate.now());
        Customer vijay = new Customer("vijay", 2, "V5", LocalDate.now(), LocalDate.now());
        Customer anil = new Customer("anil", 3, "V6",LocalDate.now(), LocalDate.now());

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

    @Override
    public Customer SaveCustomer(Customer customer) {
        Customer customer1 = Customer.builder()
                .customerName(customer.getCustomerName())
                .createdDate(LocalDate.now())
                .lastModifiedDate(LocalDate.now())
                .id(customer.getId())
                .version(customer.getVersion())
                .build();

        customerList.add(customer1);

    return customer1;
    }
}
