package com.cg.springbootcrudrestapi.repository;

import java.util.List;

import com.cg.springbootcrudrestapi.model.Customer;

public interface ICustomerRepository {

	public List<Customer> getCustomers();
	public Customer getCustomer(int id);
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer deleteCustomer(int id);
}