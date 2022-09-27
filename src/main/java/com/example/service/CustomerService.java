package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Customer;
import com.example.repository.CustomerRepository;


@Service
public class CustomerService {
	
	public CustomerRepository repository;
	
	public Customer saveCustomer( Customer customer) {
		return repository.save(customer);
	}
	
	public List<Customer> getAllCustomers(){
		return repository.findAll();
	}
	
	
}