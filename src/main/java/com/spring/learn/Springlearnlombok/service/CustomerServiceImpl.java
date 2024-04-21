package com.spring.learn.Springlearnlombok.service;

import com.spring.learn.Springlearnlombok.model.Customer;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.*;

@Service
public class CustomerServiceImpl implements CustomerService {

    private Map<UUID,Customer> customerList = new HashMap();

    public CustomerServiceImpl() {

        Customer aman = new Customer("aman", UUID.randomUUID(), "V2", LocalDate.now(), LocalDate.now());
        Customer vijay = new Customer("vijay", UUID.randomUUID(), "V5", LocalDate.now(), LocalDate.now());
        Customer anil = new Customer("anil", UUID.randomUUID(), "V6",LocalDate.now(), LocalDate.now());

        customerList.put(aman.getId(), aman);
        customerList.put(vijay.getId(), vijay);
        customerList.put(anil.getId(), anil);

    }


    @Override
    public List<Customer> getAllCustomer() {

        return customerList.values().stream().toList();
    }

    @Override
    public Customer getCustomerById(UUID id) {

        return customerList.get(id);
    }

    @Override
    public Customer SaveCustomer(Customer customer) {
        Customer customer1 = Customer.builder()
                .customerName(customer.getCustomerName())
                .createdDate(LocalDate.now())
                .lastModifiedDate(LocalDate.now())
                .id(UUID.randomUUID())
                .version(customer.getVersion())
                .build();

        customerList.put(customer1.getId(),customer1);

    return customer1;
    }
}
