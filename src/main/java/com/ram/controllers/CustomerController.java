package com.ram.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.model.Customer;
import com.ram.services.CustomerService;

@RequestMapping("api/v1/add")
@RestController
public class CustomerController {
	
	private CustomerService customerService;
	
	@Autowired
	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

   @PostMapping
	public void addCusotmer(@RequestBody Customer customer) {
		customerService.AddCustomer(customer);
	};
	

}
