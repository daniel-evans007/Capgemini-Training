package com.cg.mts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Customer;
import com.cg.mts.exception.CustomerNotFoundException;
import com.cg.mts.repository.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private ICustomerRepository customerRepository;
	
	@Override
	public Customer insertCustomer(Customer customer) {
		return (Customer) this.customerRepository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer, long id) {
		Customer cust = (Customer) customerRepository.findById(id).orElseThrow(()-> new CustomerNotFoundException("Customer not found"));
		cust.setUsername(customer.getUsername());
		cust.setEmail(customer.getEmail());
		cust.setPassword(customer.getPassword());
		cust.setMobileNumber(customer.getMobileNumber());
		return (Customer) this.customerRepository.save(cust);
	}

	@Override
	public ResponseEntity<Customer> deleteCustomer(long id) {
		Customer cust = (Customer) customerRepository.findById(id).orElseThrow(()-> new CustomerNotFoundException("Customer not found"));
		this.customerRepository.delete(cust);
		return ResponseEntity.ok().build();
	}

	@Override
	public List<Customer> viewCustomers() {
		// TODO Auto-generated method stub
		List<Customer> customerList = customerRepository.findAll();
		return customerList;
	}

	@Override
	public Customer viewCustomer(long customerId) {
		// TODO Auto-generated method stub
		Customer customer = customerRepository.findById(customerId).orElseThrow(()-> new CustomerNotFoundException("Customer not found"));
		return customer;
	}

//	@Override
//	public Customer validateCustomer(String username, String password) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}
