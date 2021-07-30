package com.cg.mts.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Admin;
import com.cg.mts.entities.TripBooking;

@Service
public interface IAdminService {
	public Admin insertAdmin(Admin admin);
	public Admin updateAdmin(Admin admin, long id);
	public ResponseEntity<Admin> deleteAdmin(long adminId);
	public List<TripBooking>getAllTrips();
	public List<TripBooking>getTripsCabwise(long cabId);
	public List<TripBooking>getTripsCustomerwise(long customerId);
	public List<TripBooking>getTripsDatewise(String date);
	public List<TripBooking>getAllTripsForDays(long customerId, String fromDate, String toDate);
}