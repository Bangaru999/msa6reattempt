package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Customer;
import com.example.repository.CustomerRepository;




@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	//@GetMapping("/customer/all")
	@RequestMapping(value = "/customer/all", method = RequestMethod.GET)
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
	}
	
	
	@PostMapping("/customer/save")
	public String saveCustomer(@RequestBody Customer c) {
		customerRepository.save(c);
		return "Customer details saved Sucessfully";
	}
	
	@DeleteMapping("/delete/customer/{id}")
	void deleteCustomer(@PathVariable Integer id) {
		customerRepository.deleteById(id);
	}

}
	
