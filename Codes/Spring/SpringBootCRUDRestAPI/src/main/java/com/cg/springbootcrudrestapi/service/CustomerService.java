package com.cg.springbootcrudrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springbootcrudrestapi.model.Customer;
import com.cg.springbootcrudrestapi.repository.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService{
	
	@Autowired
	public ICustomerRepository customerRepository;

	@Override
	public List<Customer> getCustomers() {
		return customerRepository.getCustomers();
	}

	@Override
	public Customer getCustomer(int id) {
		return customerRepository.getCustomer(id);
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.addCustomer(customer);
	}

	@Override
	public Customer deleteCustomer(int id) {
		return customerRepository.deleteCustomer(id);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerRepository.updateCustomer(customer);
	}
}