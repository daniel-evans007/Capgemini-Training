package com.cg.mts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mts.entities.Admin;
import com.cg.mts.entities.TripBooking;
import com.cg.mts.service.IAdminService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api/admin")
@Api(value="Admin Operations")
@Validated
public class AdminController {

	@Autowired
	private IAdminService adminService;
	
	@ApiOperation(value = "Login Admin")
	@PostMapping("/login")
	public String adminLogin(@ApiParam(value = "Admin login", required = true) @RequestBody Admin admin) {
		
		return adminService.LoginAdmin(admin);
	}
	
	@ApiOperation(value = "Insert a Admin")
	@PostMapping("/insertadmin")
	public String addAdmin(@ApiParam(value = "Storing Admins in the database", required = true) @RequestBody Admin admin) {
		return adminService.insertAdmin(admin);
	}
	
	@ApiOperation(value = "Update Admin Details")
	@PutMapping("/updateadmin/{id}")
	public Admin updateAdmin(@ApiParam(value = "Update Admin object", required = true) @RequestBody Admin admin,@PathVariable("id") long id) {
		return adminService.updateAdmin(admin,id);
	}
	
	@ApiOperation(value = "Remove an Admin from the Database")
	@DeleteMapping("/deleteadmin/{adminId}")
	public ResponseEntity<Admin> deleteAdmin(@ApiParam(value = "Admin ID from which Admin object will be removed from the Database", required = true) @PathVariable("adminId") int adminId) {
		return adminService.deleteAdmin(adminId);
	}
	
	@ApiOperation(value = "View a list of all the trips", response = List.class)
	@GetMapping("/getalltrips")
	public List<TripBooking> getAllTrips() {
		return adminService.getAllTrips();
	}

	@ApiOperation(value = "Get Cabs By ID")
	@GetMapping("/gettripscabwise/{cabId}")
	public List<TripBooking> getTripsCabwise(@ApiParam(value = "Cab ID by which Cabs details will be retrieved", required = true) @PathVariable("cabId") int cabId) {
		return adminService.getTripsCabwise(cabId);
	}
	
	@ApiOperation(value = "Get Trips By Customer ID")
	@GetMapping("/gettripscustomerwise/{customerId}")
	public List<TripBooking> getTripsCustomerwise(@ApiParam(value = "Get Trips by Customer ID") @PathVariable("customerId") long customerId) {
		return adminService.getTripsCustomerwise(customerId);
	}
	
	@ApiOperation(value = "Get Trips Date-wise")
	@GetMapping("/gettripsdatewise/{date}")
	public List<TripBooking> getTripsDatewise(@ApiParam(value = "Get Trips by Date") @PathVariable("date") String date) {
		return adminService.getTripsDatewise(date);
	}
	
	@GetMapping("/getalltripsfordays/{customerId:.+}/{fromDate:.+}/{toDate:.+}")
	public List<TripBooking> getAllTripsForDays (@PathVariable("customerId")long customerId,@PathVariable("fromDate") String fromDate,@PathVariable("toDate") String toDate) {
		return adminService.getAllTripsForDays(customerId, fromDate, toDate);
	}

}
