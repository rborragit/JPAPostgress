package com.ram.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ram.model.Customer;

@Repository
public interface CustomerDao {
	
	void AddCustomer(Customer customer);
	
	List<Customer> getCustomers();

}
