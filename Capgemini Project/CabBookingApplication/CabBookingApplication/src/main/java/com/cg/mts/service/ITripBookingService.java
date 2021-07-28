package com.cg.mts.service;

import java.util.List;

import com.cg.mts.entities.TripBooking;

public interface ITripBookingService {
	public TripBooking insertTripBooking(TripBooking tripBooking);
	public TripBooking updateTripBooking(TripBooking tripBooking);
	public TripBooking deleteTripBooking(TripBooking tripBooking);
	public List<TripBooking> viewAllTripsCustomer(int customerId);
	public TripBooking calculateBill(int customerId);
}