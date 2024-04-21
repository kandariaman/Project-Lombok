package com.spring.learn.Springlearnlombok.service;

import com.spring.learn.Springlearnlombok.model.Customer;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class CustomerServiceImpl implements CustomerService {

    private Map<UUID,Customer> customerMap = new HashMap();

    public CustomerServiceImpl() {

        Customer aman = new Customer("aman", UUID.randomUUID(), "V2", LocalDate.now(), LocalDate.now());
        Customer vijay = new Customer("vijay", UUID.randomUUID(), "V5", LocalDate.now(), LocalDate.now());
        Customer anil = new Customer("anil", UUID.randomUUID(), "V6",LocalDate.now(), LocalDate.now());

        customerMap.put(aman.getId(), aman);
        customerMap.put(vijay.getId(), vijay);
        customerMap.put(anil.getId(), anil);

    }


    @Override
    public List<Customer> getAllCustomer() {

        return customerMap.values().stream().toList();
    }

    @Override
    public Customer getCustomerById(UUID id) {

        return customerMap.get(id);
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

        customerMap.put(customer1.getId(),customer1);

    return customer1;
    }

    @Override
    public void updateCustomer(UUID customerId, Customer customer) {
//        Customer existingCustomer = customerMap.get(customerId);
//        existingCustomer.setCustomerName(customer.getCustomerName());
//        existingCustomer.setId(customer.getId());
//        existingCustomer.setVersion(customer.getVersion());
//        existingCustomer.setCreatedDate(customer.getCreatedDate());
//        existingCustomer.setLastModifiedDate(customer.getLastModifiedDate());

        customerMap.put(customerId, customer);
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        customerMap.remove(customerId);
    }
}
