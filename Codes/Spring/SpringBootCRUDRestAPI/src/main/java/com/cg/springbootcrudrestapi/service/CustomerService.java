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
		// TODO Auto-generated method stub
		return customerRepository.getCustomers();
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return customerRepository.getCustomer(id);
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.addCustomer(customer);
	}

	@Override
	public Customer deleteCustomer(int id) {
		// TODO Auto-generated method stub
		return customerRepository.deleteCustomer(id);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.updateCustomer(customer);
	}
}