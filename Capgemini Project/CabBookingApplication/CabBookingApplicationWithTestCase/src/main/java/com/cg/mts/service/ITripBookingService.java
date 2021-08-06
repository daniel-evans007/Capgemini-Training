package com.cg.mts.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.TripBooking;
@Service
public interface ITripBookingService {
	public TripBooking insertTripBooking(TripBooking tripBooking);
	public TripBooking updateTripBooking(TripBooking tripBooking,int id);
	public ResponseEntity<String> deleteTripBooking(int id);
	public List<TripBooking> viewAllTripsCustomer(long customerId);
	public String calculateBill(long customerId);
}