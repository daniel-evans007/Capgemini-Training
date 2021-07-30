package com.cg.mts.service;


import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.cg.mts.entities.Admin;
import com.cg.mts.entities.Customer;
import com.cg.mts.entities.Driver;
import com.cg.mts.entities.TripBooking;
import com.cg.mts.exception.AdminNotFoundException;
import com.cg.mts.repository.IAdminRepository;
import com.cg.mts.repository.ICustomerRepository;
import com.cg.mts.repository.IDriverRepository;
import com.cg.mts.repository.ITripBookingRepository;

@Service
public class AdminService implements IAdminService{

	@Autowired
	private IAdminRepository adminRepository;
	
	@Autowired
	private ICustomerRepository customerRepository;
	
	@Autowired
	private IDriverRepository driverRepository;
	
	@Autowired
	private ITripBookingRepository iTripBookingRepository;
	
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
	
	@Override
	public Admin insertAdmin(Admin admin) {
		return (Admin) this.adminRepository.save(admin);
	}

	@Override
	public Admin updateAdmin(Admin admin, long id) {
		Admin ad = null;
		ad = (Admin) adminRepository.findById(id).orElseThrow(()-> new AdminNotFoundException("Admin not found"));
		ad.setUsername(admin.getUsername());
		ad.setEmail(admin.getEmail());
		ad.setPassword(admin.getPassword());
		ad.setMobileNumber(admin.getMobileNumber());
		return (Admin) this.adminRepository.save(ad);
	}

	@Override
	public ResponseEntity<Admin> deleteAdmin(long id) {
		Admin ad = null;
		ad = adminRepository.findById(id).orElseThrow(()-> new AdminNotFoundException("Admin not found"));
		this.adminRepository.delete(ad);
		return ResponseEntity.ok().build();
	}

	@Override
	public List<TripBooking> getAllTrips() {
		List<TripBooking> tripList = iTripBookingRepository.findAll();
		return tripList;
	}

	@Override
	public List<TripBooking> getTripsCabwise(long cabId) {
		List<TripBooking> tripList = new ArrayList<TripBooking>();
		List<Driver> findAllDriver = driverRepository.findAll();
		for(int i=0; i<findAllDriver.size();i++) {
			if(findAllDriver.get(i).getCab().getCabId() == cabId) {
				tripList.add(findAllDriver.get(i).getTripBooking());
			}
		}
		return tripList;
	}

	@Override
	public List<TripBooking> getTripsCustomerwise(long customerId) {
		List<TripBooking> tripList = new ArrayList<TripBooking>();
		List<Customer> findAllCustomer = customerRepository.findAll();
		for(int i=0; i<findAllCustomer.size(); i++) {
			if(findAllCustomer.get(i).getId() == customerId) {
				tripList.add(findAllCustomer.get(i).getTripBooking());
			}
		}
		
		return tripList;
	}

	@Override
	public List<TripBooking> getTripsDatewise(String date) {
		List<TripBooking> tripList = iTripBookingRepository.findAll();
		List<TripBooking> tripList_1 = new ArrayList<TripBooking>();
		
		for(int i=0; i<tripList.size(); i++) {
			String formatDateTime = tripList.get(i).getFromDateTime().format(format);
			if(formatDateTime.equals(date)){
				tripList_1.add(tripList.get(i));
			}
		}
		return tripList_1;
	}

	@Override
	public List<TripBooking>getAllTripsForDays(long customerId, String fromDate, String toDate) {
		List<TripBooking> findAllTrip = iTripBookingRepository.findAll();
		List<TripBooking> tripList = new ArrayList<TripBooking>();
		for(int i=0; i<findAllTrip.size(); i++) {
			if(findAllTrip.get(i).getCustomerId() == customerId) {
				if(findAllTrip.get(i).getFromDateTime().format(format).equals(fromDate) && findAllTrip.get(i).getToDateTime().format(format).equals(toDate)) {
					tripList.add(findAllTrip.get(i));
				}
			}
		}
		
		return tripList;
	}
}
