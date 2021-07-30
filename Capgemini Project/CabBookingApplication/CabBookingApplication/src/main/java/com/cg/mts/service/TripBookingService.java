package com.cg.mts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Customer;
import com.cg.mts.entities.TripBooking;
import com.cg.mts.exception.CustomerNotFoundException;
import com.cg.mts.repository.ICustomerRepository;
import com.cg.mts.repository.ITripBookingRepository;

@Service
public class TripBookingService implements ITripBookingService{

	@Autowired
	private ITripBookingRepository iTripBookingRepository;
	
	@Override
	public TripBooking insertTripBooking(TripBooking tripBooking) {
		return this.iTripBookingRepository.save(tripBooking);
	}

	@Override
	public TripBooking updateTripBooking(TripBooking tripBooking, long id) {
		TripBooking trip =  iTripBookingRepository.findById(id).orElseThrow(()-> new CustomerNotFoundException("Trip not found"));
		trip.setDriver(tripBooking.getDriver());
		trip.setDistanceInKm(tripBooking.getDistanceInKm());
		trip.setBill(tripBooking.getBill());
		trip.setFromDateTime(tripBooking.getFromDateTime());
		trip.setToDateTime(tripBooking.getToDateTime());
		trip.setFromLocation(tripBooking.getFromLocation());
		trip.setToLocation(tripBooking.getToLocation());
		trip.setStatus(tripBooking.isStatus());
		return iTripBookingRepository.save(trip);
	}

	@Override
	public ResponseEntity<TripBooking> deleteTripBooking(long customerId) {
		TripBooking trip = iTripBookingRepository.findById(customerId).orElseThrow(()-> new CustomerNotFoundException("Trip not found"));
		iTripBookingRepository.delete(trip);
		return ResponseEntity.ok().build();
	}

	@Override
	public List<TripBooking> viewAllTripsCustomer(long customerId) {
		List<TripBooking> findAllTrips = iTripBookingRepository.findAll();
		List<TripBooking> tripList = new ArrayList<TripBooking>();
		for(int i=0; i<findAllTrips.size(); i++) {
			if(findAllTrips.get(i).getCustomerId() == customerId) {
				tripList.add(findAllTrips.get(i));
			}
		}
		return tripList;
	}

	@Override
	public String calculateBill(long customerId) {
		List<TripBooking> findAllTrip = iTripBookingRepository.findAll();
		List<TripBooking> tripList = new ArrayList<TripBooking>();
		for(int i=0; i<findAllTrip.size(); i++) {
			if(findAllTrip.get(i).getCustomerId() == customerId) {
				tripList.add(findAllTrip.get(i));
			}
		}
		int size = tripList.size() - 1;
		String bill = "Total bill is: "+tripList.get(size).getBill();
		return bill;
	}

}
