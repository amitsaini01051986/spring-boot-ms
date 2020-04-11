package org.shopping.springbootstarter.service;

import java.util.ArrayList;
import java.util.List;

import org.shopping.springbootstarter.model.Customer;
import org.shopping.springbootstarter.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Amit Saini
 *
 */
@Service
public class CustomerService {

	@Autowired
	CustomerRepository repository;

	// Save student entity in the h2 database.
	public void save(final Customer customer) {
		repository.save(customer);
	}

	// Get all students from the h2 database.
	public List<Customer> getAll() {
		final List<Customer> customers = new ArrayList<>();
		repository.findAll().forEach(student -> customers.add(student));
		return customers;
	}

}
