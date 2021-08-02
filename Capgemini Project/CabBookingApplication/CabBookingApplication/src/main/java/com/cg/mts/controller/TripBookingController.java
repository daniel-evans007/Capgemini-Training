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

import com.cg.mts.entities.TripBooking;
import com.cg.mts.service.ITripBookingService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api/tripbook")
@Api(value="Trip Booking Operations")
@Validated
public class TripBookingController {

	@Autowired
	private ITripBookingService tripBookingService;
	
	@ApiOperation(value = "Insert a Trip")
	@PostMapping("/inserttrip")
	public TripBooking insertTripBooking(@ApiParam(value = "Storing Trips in the database", required = true) @RequestBody TripBooking tripBooking) {
		return tripBookingService.insertTripBooking(tripBooking);
	}
	
	@ApiOperation(value = "Update Trip Details")
	@PutMapping("/updatetrip/{id}")
	public TripBooking updateTripBooking(@ApiParam(value = "Trip ID to update Trip details", required = true) @RequestBody TripBooking tripBooking, @PathVariable("id")int id) {
		return tripBookingService.updateTripBooking(tripBooking,id);
	}
	
	@ApiOperation(value = "Delete a Trip")
	@DeleteMapping("/deletetrip/{id}")
	public ResponseEntity<TripBooking> deleteTripBooking(@ApiParam(value = "Trip ID from which Trip object will be removed from the Database", required = true)  @PathVariable("id")int id) {
		// TODO Auto-generated method stub
		return tripBookingService.deleteTripBooking(id);
	}
	
	@ApiOperation(value = "View All Trips of a Customer")
	@GetMapping("/viewalltripscustomer/{id}")
	public List<TripBooking> viewAllTripsCustomer(@ApiParam(value = "Customer ID by which Trip details will be retrieved", required = true) @PathVariable("id") int customerId){
		return tripBookingService.viewAllTripsCustomer(customerId);
	}
	
	@ApiOperation(value = "Get Customer Bill by ID")
	@GetMapping("/customerbill/{id}")
	public String calculateBill(@ApiParam(value = "Customer ID from which Trip Bill will be retrieved", required = true) @PathVariable("id") long customerId) {
		// TODO Auto-generated method stub
		return tripBookingService.calculateBill(customerId);
	}
}
