package com.ram.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.dao.CustomerDao;
import com.ram.model.Customer;
import com.ram.repos.CustRepo;

@Service
public class CustomerService{
   
	@Autowired
	private CustRepo custRepo;
	
//	@Autowired
//	public CustomerService(CustRepo custRepo) {
//		super();
//		this.custRepo = custRepo;
//	}

//	@Override
	public void AddCustomer(Customer customer) {
		custRepo.save(customer);
		System.out.println("Customer Saved" + customer.getName() + " " + customer.getId());
		
	}

//	@Override
	public List<Customer> getCustomers() {
		
		return null;
	}

}
