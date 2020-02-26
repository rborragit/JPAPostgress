package com.ram.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ram.model.Customer;

@Repository
public interface CustRepo extends CrudRepository<Customer, Long> {

}
