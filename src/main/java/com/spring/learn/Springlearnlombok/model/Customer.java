package com.spring.learn.Springlearnlombok.model;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
@NoArgsConstructor
public class Customer {

    private String customerName;
    private Integer id;
    private String version;
    private Date createdDate;
    private Date lastModifiedDate;

    public Customer(String customerName, Integer id, String version, Date createdDate, Date lastModifiedDate) {
        this.customerName = customerName;
        this.id = id;
        this.version = version;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
    }

    public static CustomerBuilder builder() {
        return new CustomerBuilder();
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Customer;
    }

    public static class CustomerBuilder {
        private String customerName;
        private Integer id;
        private String version;
        private Date createdDate;
        private Date lastModifiedDate;

        CustomerBuilder() {
        }

        public CustomerBuilder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public CustomerBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public CustomerBuilder version(String version) {
            this.version = version;
            return this;
        }

        public CustomerBuilder createdDate(Date createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public CustomerBuilder lastModifiedDate(Date lastModifiedDate) {
            this.lastModifiedDate = lastModifiedDate;
            return this;
        }

        public Customer build() {
            return new Customer(this.customerName, this.id, this.version, this.createdDate, this.lastModifiedDate);
        }

        public String toString() {
            return "Customer.CustomerBuilder(customerName=" + this.customerName + ", id=" + this.id + ", version=" + this.version + ", createdDate=" + this.createdDate + ", lastModifiedDate=" + this.lastModifiedDate + ")";
        }
    }
}
