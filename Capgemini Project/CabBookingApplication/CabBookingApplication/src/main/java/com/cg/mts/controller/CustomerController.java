package com.cg.mts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mts.entities.Customer;
import com.cg.mts.service.ICustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	@Autowired
	private ICustomerService customerService;
	
	@PostMapping("/insertcustomer")
	public Customer insertCustomer(@RequestBody Customer customer) {
		return customerService.insertCustomer(customer);
	}
	
	@PutMapping("/updatecustomer/{id}")
	public Customer updateCustomer(@RequestBody Customer customer, @PathVariable("id") long id) {
		return customerService.updateCustomer(customer, id);
	}
	
	@DeleteMapping("/deletecustomer/{id}")
	public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") long id) {
		return customerService.deleteCustomer(id);
	}
	
/*	@GetMapping("/getallcustomers")
	public List<Customer> getAllCustomers() {
		return customerService.viewCustomers();
	}
	
	@GetMapping("/getcustomerbyid/{customerId}")
	public Customer getCustomerById(@PathVariable("customerId") int customerId) {
		return customerService.viewCustomer(customerId);
	} */
}