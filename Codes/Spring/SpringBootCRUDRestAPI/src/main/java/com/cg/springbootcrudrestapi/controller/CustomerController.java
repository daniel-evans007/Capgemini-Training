package com.cg.springbootcrudrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springbootcrudrestapi.model.Customer;
import com.cg.springbootcrudrestapi.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	public ICustomerService customerService;
	
	@GetMapping("/getallcustomers")
	public List<Customer> getCustomers(){
		return customerService.getCustomers();
	}

	@GetMapping("/getcustomer/{custid}")
	public Customer getCustomer(@PathVariable("custid")int cid){
		return customerService.getCustomer(cid);
	}
	
	@PostMapping("/addcustomer")
	public Customer addCustomer(@RequestBody Customer customer){
		return customerService.addCustomer(customer);
	}
	
	@PutMapping("/updatecustomer")
	public Customer updateCustomer(@RequestBody Customer customer){
		return customerService.updateCustomer(customer);
	}
	
	@DeleteMapping("/deletecustomer/{custid}")
	public Customer deleteCustomer(@PathVariable("custid")int cid){
		return customerService.deleteCustomer(cid);
	}
}