package com.cg.springbootcrudrestapi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.springbootcrudrestapi.model.Customer;

@Repository
public class CustomerRepository implements ICustomerRepository{
	
	public List<Customer> customerList = new ArrayList<Customer>();

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerList;
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		Customer result = null ;
		for(Customer customer :customerList) {
			if(customer.getCustId() == id) {
				result = customer;
			}
		}
		return result;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerList.add(customer);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerList.add(customer);
		return customer;
	}

	@Override
	public Customer deleteCustomer(int id) {
		// TODO Auto-generated method stub
		int index = 0 ;
		Customer result = null ;
		for(int i=0;i<customerList.size();i++) {
			if(customerList.get(i).getCustId() == id) {
				index = i;
				result = customerList.get(i);
			}
		}
		customerList.remove(index);
		return result;
	}
}