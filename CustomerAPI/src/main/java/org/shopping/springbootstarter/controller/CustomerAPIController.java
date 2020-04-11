package org.shopping.springbootstarter.controller;

import java.util.List;

import org.shopping.springbootstarter.model.Customer;
import org.shopping.springbootstarter.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Amit Saini
 *
 */
@RestController
public class CustomerAPIController {
	
	@Autowired
    CustomerService service;
	
	@RequestMapping("/customers")
	public List<Customer> getAllCustomer() {
		return service.getAll();
	}

}
