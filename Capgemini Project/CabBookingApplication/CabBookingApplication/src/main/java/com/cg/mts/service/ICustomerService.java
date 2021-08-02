package com.cg.mts.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Customer;
@Service
public interface ICustomerService {
	public String insertCustomer(Customer customer);
	public Customer updateCustomer(Customer customer,long id);
	public ResponseEntity<Customer> deleteCustomer(long id);
	public List<Customer>viewCustomers();
	public Customer viewCustomer(long customerId);
	public Customer validateCustomer(String username, String password);
	public String LoginUser(Customer customer);
}