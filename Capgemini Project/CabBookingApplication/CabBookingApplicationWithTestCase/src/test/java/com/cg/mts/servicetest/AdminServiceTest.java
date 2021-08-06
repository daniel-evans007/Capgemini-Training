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

import com.cg.mts.entities.Admin;
import com.cg.mts.repository.IAdminRepository;
import com.cg.mts.service.AdminService;

/**
 * @author Niharika
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminServiceTest {
	@Autowired
	private AdminService adminService;

	@MockBean
	private IAdminRepository adminRepo;
	

	@Test
	public void insertAdminTest() {
		Admin ad = new Admin("niharika", "1234", "8459671250", "niharika@gmail.com", 1001);
		Mockito.when(adminRepo.save(ad)).thenReturn(ad);
		List<Admin> adminList = adminRepo.findAll();
		for(int i=0; i<adminList.size(); i++) {
			if(adminList.get(i).getAdminId() == ad.getAdminId()) {
				assertEquals(ad, adminList.get(i));
			}
		}
		
	}

	
	  @Test 
	  public void LoginAdminTest() {
		  Admin admin = new Admin("niharika", "1234", "8459671250", "niharika@gmail.com", 1001);
		  List<Admin> adminList= new ArrayList<>();
		  adminList.add(admin);
		  String result = "niharika is logged in";
		  when(adminRepo.findAll()).thenReturn(adminList);
			assertEquals(result, adminService.LoginAdmin(admin));
	  }
	  
	 
	 @Test 
	 public void deleteAdminTest() { 
		 Admin admin = new Admin("niharika", "1234", "8459671250", "niharika@gmail.com", 1001);
		 long id = 1001;
		 adminRepo.save(admin);
		 List<Admin> allAdmin = adminRepo.findAll();
		 for(int i=0; i<allAdmin.size(); i++) {
			 if(allAdmin.get(i).getAdminId() == id) {
				 adminRepo.delete(allAdmin.get(i));
				 assertEquals(allAdmin.get(i), null);
			 }
		 }
		 
	 }
	 
  @Test 
  public void updateAdminTest() { 
	 
	  Admin admin = new Admin("niharika", "1234", "8459671250", "niharika@gmail.com", 1001);
	  Admin newAdmin = new Admin("niharika", "12345", "8459671250", "niharika99@gmail.com", 1001);
	  adminRepo.save(admin);
	  List<Admin> allAdmin = adminRepo.findAll();
	  for(int i=0; i<allAdmin.size(); i++) {
		  if(allAdmin.get(i).getAdminId() == newAdmin.getAdminId()) {
			  
			  allAdmin.get(i).setEmail(newAdmin.getEmail());
			  allAdmin.get(i).setMobileNumber(newAdmin.getMobileNumber());
			  allAdmin.get(i).setPassword(newAdmin.getPassword());
			  allAdmin.get(i).setUsername(newAdmin.getUsername());
			  adminRepo.save(allAdmin.get(i));
			  
			  assertEquals(allAdmin.get(i).getAdminId(),newAdmin.getAdminId());
			  assertEquals(allAdmin.get(i).getUsername(),newAdmin.getUsername());
			  assertEquals(allAdmin.get(i).getMobileNumber(),newAdmin.getMobileNumber());
			  assertEquals(allAdmin.get(i).getEmail(),newAdmin.getEmail());
			  assertEquals(allAdmin.get(i).getPassword(),newAdmin.getPassword());
		  }
	  }
	
  }
  
	/*
	 * @Test public void getAllTripsTest() { }
	 * 
	 * @Test public void getTripsCabwiseTest() { }
	 * 
	 * @Test public void getTripsCustomerwiseTest() { }
	 * 
	 * @Test public void getTripsDatewiseTest() { }
	 */
 
}