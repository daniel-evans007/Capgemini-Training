package com.cg.mts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Customer;
import com.cg.mts.entities.TripBooking;
import com.cg.mts.exception.CustomerNotFoundException;
import com.cg.mts.exception.TripBookingNotFoundException;
import com.cg.mts.repository.ICustomerRepository;
import com.cg.mts.repository.ITripBookingRepository;

@Service
public class TripBookingService implements ITripBookingService{
	

	@Autowired
	private ITripBookingRepository iTripBookingRepository;
	
	@Autowired
	private ICustomerRepository iCustomerRepository;
	
	@Override
	public TripBooking insertTripBooking(TripBooking tripBooking) {
		// TODO Auto-generated method stub
		return this.iTripBookingRepository.save(tripBooking);
	}
	
	@Override
	public TripBooking updateTripBooking(TripBooking tripBooking, int id) {
		// TODO Auto-generated method stub
		TripBooking trip =  iTripBookingRepository.findById(id).orElseThrow(()-> new TripBookingNotFoundException("Trip not found"));
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
	public ResponseEntity<TripBooking> deleteTripBooking(int id) {
		// TODO Auto-generated method stub
		TripBooking trip = iTripBookingRepository.findById(id).orElseThrow(()-> new TripBookingNotFoundException("Trip not found"));
		iTripBookingRepository.delete(trip);
		return ResponseEntity.ok().build();
	}

	@Override
	public List<TripBooking> viewAllTripsCustomer(long customerId) {
		// TODO Auto-generated method stub
		List<TripBooking> findAllTrips = iTripBookingRepository.findAll();
		List<TripBooking> tripList = new ArrayList<TripBooking>();
		for(int i=0; i<findAllTrips.size(); i++) {
			if(findAllTrips.get(i).getCustomer().getCustomerId() == customerId) {
				tripList.add(findAllTrips.get(i));
			}
		}
		return tripList;
	}

	@Override
	public String calculateBill(long customerId) {
		// TODO Auto-generated method stub
		Customer cust = iCustomerRepository.findById(customerId).orElseThrow(()-> new CustomerNotFoundException("Customer not found."));
		List<TripBooking> findAllTrip = iTripBookingRepository.findAll();
		List<TripBooking> tripList = new ArrayList<TripBooking>();
		for(int i=0; i<findAllTrip.size(); i++) {
			if(findAllTrip.get(i).getCustomer().getCustomerId() == customerId) {
				tripList.add(findAllTrip.get(i));
			}
		}
		int size = tripList.size() - 1;
		String bill = "Total bill is: "+tripList.get(size).getBill();
		return bill;
	}

}
