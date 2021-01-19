package com.example.compositekey;

import com.example.compositekey.models.Customer;
import com.example.compositekey.models.CustomerId;
import com.example.compositekey.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CompositekeyApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testSaveCustomer() {

		Customer customer = new Customer();

		CustomerId customerId = new CustomerId();
		customerId.setId(111);
		customerId.setEmail("c.rotariu@dmt-winches.com");

		customer.setCustomerId(customerId);
		customer.setName("Catalin22");

		customerRepository.save(customer);
	}
}
