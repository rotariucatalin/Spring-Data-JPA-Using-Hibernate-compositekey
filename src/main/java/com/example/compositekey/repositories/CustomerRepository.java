package com.example.compositekey.repositories;

import com.example.compositekey.models.Customer;
import com.example.compositekey.models.CustomerId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, CustomerId> {
}
