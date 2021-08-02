package com.cg.mts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Customer;
import com.cg.mts.exception.CustomerNotFoundException;
import com.cg.mts.repository.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService{
	
	@Autowired
	private ICustomerRepository customerRepository;
	static int flag=0;

	@Override
	public String insertCustomer(Customer customer) {
		int check = 0;
		List<Customer> findAllCustomer = customerRepository.findAll();
		for(int i=0; i<findAllCustomer.size(); i++) {
			if(findAllCustomer.get(i).getEmail().equals(customer.getEmail())){
				check = 1;
				break;
			}
		}
		if(check == 0) {
			this.customerRepository.save(customer);
			return customer.getUsername()+"'s account is created.";
		}else {
			return customer.getEmail()+" already exists";
		}
	}

	public String LoginUser(Customer customer) {
		List<Customer> ad = customerRepository.findAll();
		String user = "";
		String result=null;
		for(int i=0; i<ad.size(); i++) {
			if(ad.get(i).getEmail().equals(customer.getEmail()) && ad.get(i).getPassword().equals(customer.getPassword())) {
				flag = 1;
				user = ad.get(i).getUsername();
				break;
			}	
		}
		if(flag == 1) {
			result = user+" is logged in";
		}else {
			result = "Username or Password is wrong.";
		}
		return result;
	}
	
	@Override
	public Customer updateCustomer(Customer customer, long id) {
		if(flag == 1) {
			Customer cust = (Customer) customerRepository.findById(id).orElseThrow(()-> new CustomerNotFoundException("Customer not found"));
			cust.setUsername(customer.getUsername());
			cust.setEmail(customer.getEmail());
			cust.setPassword(customer.getPassword());
			cust.setMobileNumber(customer.getMobileNumber());
			return (Customer) this.customerRepository.save(cust);
		}else {
			throw new CustomerNotFoundException("User is not logged in.");
		}
	}

	@Override
	public ResponseEntity<Customer> deleteCustomer(long id) {
		if(flag == 1) {
			Customer cust = (Customer) customerRepository.findById(id).orElseThrow(()-> new CustomerNotFoundException("Customer not found"));
			this.customerRepository.delete(cust);
			return ResponseEntity.ok().build();
		}else {
			throw new CustomerNotFoundException("User is not logged in.");
		}
	}

	@Override
	public List<Customer> viewCustomers() {
		// TODO Auto-generated method stub
		if(flag == 1) {
			List<Customer> customerList = customerRepository.findAll();
			return customerList;
		}else {
			throw new CustomerNotFoundException("User is not logged in.");
		}
	}

	@Override
	public Customer viewCustomer(long customerId) {
		// TODO Auto-generated method stub
		if(flag == 1) {
			Customer customer = customerRepository.findById(customerId).orElseThrow(()-> new CustomerNotFoundException("Customer not found"));
			return customer;
		}else {
			throw new CustomerNotFoundException("User is not logged in.");
		}
	}

	@Override
	public Customer validateCustomer(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
