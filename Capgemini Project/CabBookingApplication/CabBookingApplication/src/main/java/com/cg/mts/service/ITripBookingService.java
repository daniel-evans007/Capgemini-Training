package com.cg.mts.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.TripBooking;

@Service
public interface ITripBookingService {
	public TripBooking insertTripBooking(TripBooking tripBooking);
	public TripBooking updateTripBooking(TripBooking tripBooking,long id);
	public ResponseEntity<TripBooking> deleteTripBooking(long customerId);
	public List<TripBooking> viewAllTripsCustomer(long customerId);
	public String calculateBill(long customerId);
}