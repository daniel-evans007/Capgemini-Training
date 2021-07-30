package com.cg.mts.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
import com.cg.mts.service.AdminService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/admin")
@Api(value="Admin Operations")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@ApiOperation(value = "Insert a Admin")
	@PostMapping("/insertadmin")
	public Admin insertAdmin(@ApiParam(value = "Storing Admins in the database", required = true) @RequestBody Admin admin) {
		return this.adminService.insertAdmin(admin);
	}
	
	@ApiOperation(value = "Update Admin Details")
	@PutMapping("/updateadmin/{id}")
	public Admin updateAdmin(@ApiParam(value = "Update Admin object", required = true) @Valid @RequestBody Admin admin,
			@ApiParam(value = "Admin ID to update Admin details", required = true) @PathVariable("id") long id) {
		return adminService.updateAdmin(admin,id);
	}
	
	@ApiOperation(value = "Remove an Admin from the Database")
	@DeleteMapping("/deleteadmin/{id}")
	public ResponseEntity<Admin> deleteAdmin(@ApiParam(value = "Admin ID from which Admin object will be removed from the Database", required = true)
	@PathVariable("id") long id) {
		return adminService.deleteAdmin(id);
	}
	
	@ApiOperation(value = "View a list of all the trips", response = List.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved the list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
	@GetMapping("/getalltrips")
	public List<TripBooking> getAllTrips() {
		return adminService.getAllTrips();
	}
	
	@ApiOperation(value = "Get Cabs By ID")
	@GetMapping("/gettripscabwise/{cabId}")
	public List<TripBooking> getTripsCabwise(@ApiParam(value = "Cab ID by which Cabs details will be retrieved", required = true) @PathVariable("cabId") long cabId) {
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
	
	@ApiOperation(value = "Get Trips By Customer ID within a range of Dates")
	@GetMapping("/getalltripsfordays/{customerId:.+}/{fromDate:.+}/{toDate:.+}")
	public List<TripBooking> getAllTripsForDays (@ApiParam(value = "Customer ID by which Customer details will be retrieved", required = true) @PathVariable("customerId") long customerId,
			@ApiParam(value = "Get the Starting Date") @PathVariable("fromDate") String fromDate,
			@ApiParam(value = "Get the End Date") @PathVariable("toDate") String toDate) {
		return adminService.getAllTripsForDays(customerId, fromDate, toDate);
	}
}