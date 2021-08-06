package com.cg.mts.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.when;

import com.cg.mts.entities.Customer;
import com.cg.mts.repository.ICustomerRepository;
import com.cg.mts.service.CustomerService;

/**
 * @author Niharika
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {
	@Autowired
	private CustomerService customerService;
	
	@MockBean
	private ICustomerRepository customerRepo;
	
	@Test 
	public void insertCustomerTest(){ 
		Customer cust = new Customer(201,"Rishi","xyza","8695423657","rishi@gmail.com",201);
		Mockito.when(customerRepo.save(cust)).thenReturn(cust); 
		List<Customer> customerList = customerRepo.findAll();
		
		for(int i=0; i<customerList.size(); i++) {
			if(customerList.get(i).getCustomerId() == cust.getCustomerId()) {
				assertEquals(cust, customerList.get(i));

			}
		}			  
	}

	
	@Test 
	public void updateCustomerTest(){
		  
		  Customer customer=new Customer(201,"Rishi","xyza","8695423657","rishi@gmail.com",201);
		  Customer newCustomer=new Customer(201,"Vinita","bhhdvc","8595423657","vinita@gmail.com",201);
		  customerRepo.save(customer);
		  List<Customer> allCustomer = customerRepo.findAll();
		  for(int i=0; i<allCustomer.size(); i++) {
			  if(allCustomer.get(i).getCustomerId() == newCustomer.getCustomerId()) {
				  
				  allCustomer.get(i).setEmail(newCustomer.getEmail());
				  allCustomer.get(i).setMobileNumber(newCustomer.getMobileNumber());
				  allCustomer.get(i).setPassword(newCustomer.getPassword());
				  allCustomer.get(i).setUsername(newCustomer.getUsername());
				  customerRepo.save(allCustomer.get(i));
				  
				  assertEquals(allCustomer.get(i).getCustomerId(),newCustomer.getCustomerId());
				  assertEquals(allCustomer.get(i).getUsername(),newCustomer.getUsername());
				  assertEquals(allCustomer.get(i).getMobileNumber(),newCustomer.getMobileNumber());
				  assertEquals(allCustomer.get(i).getEmail(),newCustomer.getEmail());
				  assertEquals(allCustomer.get(i).getPassword(),newCustomer.getPassword());
			  }
		  }

	  }
	  
	  
	  @Test 
	  public void deleteCustomerTest(){ 
		  Customer customer = new Customer(201,"Rishi","xyza","8695423657","rishi@gmail.com",201); 
		  customerRepo.save(customer);
		  List<Customer> allCustomer = customerRepo.findAll();
		  for(int i=0; i<allCustomer.size(); i++) {
			  if(allCustomer.get(i).getCustomerId() == 201) {
				  customerRepo.delete(allCustomer.get(i));
				  assertEquals(allCustomer.get(i), null);
			  }
		  }
	  }
	  
	  
	@Test
	public void LoginUserTest(){
			  Customer customer = new Customer(201,"Rishi","xyza","8695423657","rishi@gmail.com",201);
			  List<Customer> customerList= new ArrayList<>();
			  customerList.add(customer);
			  String result = "Rishi is logged in";
			  when(customerRepo.findAll()).thenReturn(customerList);
				assertEquals(result, customerService.LoginUser(customer));
		  }
		
	/*
	 * @Test public void viewCustomersTest(){ }
	 * 
	 * @Test public void viewCustomerTest(){ }
	 * 
	 * @Test public void validateCustomerTest(){ }
	 */
 
}
	


