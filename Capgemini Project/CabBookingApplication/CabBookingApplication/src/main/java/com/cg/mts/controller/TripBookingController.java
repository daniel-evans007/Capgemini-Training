package com.cg.mts.controller;

import java.util.List;

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

import com.cg.mts.entities.TripBooking;
import com.cg.mts.service.TripBookingService;

@RestController
@RequestMapping("api/tripbooking")
public class TripBookingController {

	@Autowired
	private TripBookingService tripBookingService;
	
	@PostMapping("/inserttrip")
	public TripBooking insertTripBooking(@RequestBody TripBooking tripBooking) {
		return tripBookingService.insertTripBooking(tripBooking);
	}
	
	@PutMapping("/updatetrip/{id}")
	public TripBooking updateTripBooking(@RequestBody TripBooking tripBooking, @PathVariable("id")int id) {
		return tripBookingService.updateTripBooking(tripBooking,id);
	}
	
	@DeleteMapping("/deletetrip/{id}")
	public ResponseEntity<TripBooking> deleteTripBooking(@PathVariable("id")int id) {
		// TODO Auto-generated method stub
		return tripBookingService.deleteTripBooking(id);
	}
	
	@GetMapping("/viewalltripscustomer/{id}")
	public List<TripBooking> viewAllTripsCustomer(@PathVariable("id") int customerId){
		return tripBookingService.viewAllTripsCustomer(customerId);
	}
	@GetMapping("/customerbill/{id}")
	public String calculateBill(@PathVariable("id") long customerId) {
		// TODO Auto-generated method stub
		return tripBookingService.calculateBill(customerId);
	}

}
