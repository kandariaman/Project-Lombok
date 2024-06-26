package com.spring.learn.Springlearnlombok.model;

import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Data
@Component
@NoArgsConstructor
@Builder
public class Customer {

    private String customerName;
    private UUID id;
    private String version;
    private LocalDate createdDate;
    private LocalDate lastModifiedDate;

    public Customer(String customerName, UUID id, String version, LocalDate createdDate, LocalDate lastModifiedDate) {
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
        private UUID id;
        private String version;
        private LocalDate createdDate;
        private LocalDate lastModifiedDate;

        CustomerBuilder() {
        }

        public CustomerBuilder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public CustomerBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public CustomerBuilder version(String version) {
            this.version = version;
            return this;
        }

        public CustomerBuilder createdDate(LocalDate createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public CustomerBuilder lastModifiedDate(LocalDate lastModifiedDate) {
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
