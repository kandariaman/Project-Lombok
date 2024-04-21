package com.spring.learn.Springlearnlombok.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Customer {

    private String customerName;
    private Integer id;
    private String version;
    private Date createdDate;
    private Date lastModifiedDate;
}
