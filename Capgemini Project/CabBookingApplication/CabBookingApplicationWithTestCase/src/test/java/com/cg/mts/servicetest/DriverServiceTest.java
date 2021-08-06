package com.cg.mts.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.mts.entities.Cab;
import com.cg.mts.entities.Driver;
import com.cg.mts.repository.IDriverRepository;
import com.cg.mts.service.DriverService;

/**
 * @author Niharika
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DriverServiceTest {
	@Autowired
	private DriverService driverService;

	@MockBean
	private IDriverRepository driverRepo;
	
	
	
	  @Test 
	  public void insertDriverTest(){ 
		  Cab cab= new Cab(10001,"sedan",20.50f);
		  Driver driver= new Driver(301,"mukesh","abcd","7594621835","mukesh@gmail.com",101,"845762",cab,4.6f); 
		  List<Driver> driverList = driverRepo.findAll();
		  Mockito.when(driverRepo.save(driver)).thenReturn(driver);
	  
		  for(int i=0; i<driverList.size(); i++) {
			  if(driverList.get(i).getDriverId() == driver.getDriverId()) {
				  assertEquals(driver, driverService.insertDriver(driver));
			  }
		  }
	  }
	  
	  
	  @Test 
	  public void LoginDriverTest(){ 
		  Cab cab= new Cab(10001,"sedan",20.50f);
		  Driver driver = new Driver(301,"mukesh","abcd","7594621835","mukesh@gmail.com",101,"845762",cab,4.6f);
		  List<Driver> driverList= new ArrayList<>();
		  driverList.add(driver);
		  String result = "mukesh is logged in";
		  when(driverRepo.findAll()).thenReturn(driverList);
			assertEquals(result, driverService.LoginDriver(driver));
		  
	  }
	 
	  
	  @Test
	  public void updateDriverTest() { 
		  Cab cab= new Cab(10001,"sedan",20.50f);
			 
	  Driver driver= new Driver(301,"mukesh","abcd","7594621835","mukesh@gmail.com",101,"845762",cab,4.6f); 
	  Driver newdriver= new Driver(301,"ram","1234","8594631235","ram@gmail.com",101,"845751",cab,4.5f); 
	  driverRepo.save(driver);
	  List<Driver> allDriver = driverRepo.findAll();
	  for(int i=0; i<allDriver.size(); i++) {
		  if(allDriver.get(i).getDriverId() == newdriver.getDriverId()) {
			  
			  allDriver.get(i).setEmail(newdriver.getEmail());
			  allDriver.get(i).setMobileNumber(newdriver.getMobileNumber());
			  allDriver.get(i).setPassword(newdriver.getPassword());
			  allDriver.get(i).setUsername(newdriver.getUsername());
			  driverRepo.save(allDriver.get(i));
			  
			  assertEquals(allDriver.get(i).getDriverId(),newdriver.getDriverId());
			  assertEquals(allDriver.get(i).getUsername(),newdriver.getUsername());
			  assertEquals(allDriver.get(i).getMobileNumber(),newdriver.getMobileNumber());
			  assertEquals(allDriver.get(i).getEmail(),newdriver.getEmail());
			  assertEquals(allDriver.get(i).getPassword(),newdriver.getPassword());
		  }
	  }

	  }

  @Test public void deleteDriverTest(){ 
	  Cab cab= new Cab(10001,"sedan",20.50f);
	  Driver driver = new Driver(301,"mukesh","abcd","7594621835","mukesh@gmail.com",101,"845762",cab,4.6f);
	  long id = 301;
	  driverRepo.save(driver);
	  List<Driver> driverAll = driverRepo.findAll();
	  for(int i=0; i<driverAll.size(); i++) {
		  if(driverAll.get(i).getDriverId() == id) {
			  driverRepo.delete(driverAll.get(i));
			  assertEquals(driverAll.get(i), null);
		  }
	  }
  }
  
	/*
	 * @Test public void viewBestDriversTest() { }
	 * 
	 * @Test public void viewDriverTest() { }
	 */
 
}