package com.example.compositekey.models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Customer {

    @EmbeddedId
    private CustomerId customerId;
    private String name;

    public Customer() {

    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public void setCustomerId(CustomerId customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
