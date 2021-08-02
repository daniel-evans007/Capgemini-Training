package com.cg.mts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.TripBooking;

@Repository
public interface ITripBookingRepository extends JpaRepository<TripBooking, Integer>{
//	public TripBooking insertTripBooking(TripBooking tripBooking);
//	public TripBooking updateTripBooking(TripBooking tripBooking);
//	public TripBooking deleteTripBooking(TripBooking tripBooking);
//	public List<TripBooking> viewAllTripsCustomer(int customerId);
//	public TripBooking calculateBill(int customerId);
}