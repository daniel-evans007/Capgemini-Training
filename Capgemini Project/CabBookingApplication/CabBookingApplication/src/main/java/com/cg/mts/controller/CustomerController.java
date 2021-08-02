package com.cg.mts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/customer")
@Api(value="Customer Operations")
@Validated
public class CustomerController {

	@Autowired
	private ICustomerService customerService;
	
	@ApiOperation(value = "Customer Login")
	@PostMapping("/login")
	public String userLogin(@ApiParam(value = "Customer login", required = true) @RequestBody Customer customer) {
		
		return customerService.LoginUser(customer);
	}
	
	@ApiOperation(value = "Insert a Customer")
	@PostMapping("/insertcustomer")
	public String insertCustomer(@ApiParam(value = "Storing Customers in the database", required = true) @RequestBody Customer customer) {
		return customerService.insertCustomer(customer);
	}
	
	@ApiOperation(value = "Update Customer Details")
	@PutMapping("/updatecustomer/{id}")
	public Customer updateCustomer(@ApiParam(value = "Customer ID to update Customer details", required = true) @RequestBody Customer customer, @PathVariable("id") long id) {
		return customerService.updateCustomer(customer, id);
	}
	
	@ApiOperation(value = "Remove a Customer from the Database")
	@DeleteMapping("/deletecustomer/{id}")
	public ResponseEntity<Customer> deleteCustomer(@ApiParam(value = "Customer ID from which Customer object will be removed from the Database", required = true) @PathVariable("id") long id) {
		return customerService.deleteCustomer(id);
	}
	
	@ApiOperation(value = "View a list of all the customers", response = List.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved the list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
	@GetMapping("/getallcustomers")
	public List<Customer> getAllCustomers() {
		return customerService.viewCustomers();
	}
	
	@ApiOperation(value = "Get Customer By ID")
	@GetMapping("/getcustomerbyid/{customerId}")
	public Customer getCustomerById(@ApiParam(value = "Customer ID by which Customer details will be retrieved", required = true) @PathVariable("customerId") long customerId) {
		return customerService.viewCustomer(customerId);
	}
	
}
