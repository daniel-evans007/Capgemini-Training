package com.cg.mts.service;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Admin;
import com.cg.mts.entities.TripBooking;
import com.cg.mts.exception.AdminNotFoundException;
import com.cg.mts.repository.IAdminRepository;
import com.cg.mts.repository.ITripBookingRepository;

@Service
public class AdminService implements IAdminService{

	@Autowired
	private IAdminRepository adminRepository;
	
	@Autowired
	private ITripBookingRepository iTripBookingRepository;
	
	
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	static int flag=0;
	
	@Override
	public String insertAdmin(Admin admin) {
		// TODO Auto-generated method stub
		int check = 0;
		List<Admin> findAllAdmin = adminRepository.findAll();
		String email = "";
		for(int i=0; i<findAllAdmin.size(); i++) {
			if(findAllAdmin.get(i).getEmail().equals(admin.getEmail())) {
				check = 1;
				email = findAllAdmin.get(i).getEmail();
				break;
			}
		}
		if(check == 0) {
			this.adminRepository.save(admin);
			return admin.getUsername()+"'s account is created";
		}else {
			return email+" already exists.";
		}

	}
	
	public String LoginAdmin(Admin admin) {
		List<Admin> ad = adminRepository.findAll();
		String result=null;
		for(int i=0; i<ad.size(); i++) {
			if(ad.get(i).getUsername().equals(admin.getUsername()) && ad.get(i).getPassword().equals(admin.getPassword())) {
				flag = 1;
				break;
			}
		}
		if(flag == 1) {
			result = admin.getUsername()+" is logged in";
		}else {
			result = "Username or Password is wrong.";
		}
		return result;
	}

	@Override
	public Admin updateAdmin(Admin admin, long id) {
		// TODO Auto-generated method stub
		if(flag == 1) {
			Admin ad = null;
			ad = (Admin) adminRepository.findById(id).orElseThrow(()-> new AdminNotFoundException("Admin not found"));
			ad.setUsername(admin.getUsername());
			ad.setEmail(admin.getEmail());
			ad.setPassword(admin.getPassword());
			ad.setMobileNumber(admin.getMobileNumber());
			return (Admin) this.adminRepository.save(ad);
		}else {
			throw new AdminNotFoundException("Admin is not logged in.");
		}
	}

	@Override
	public ResponseEntity<Admin> deleteAdmin(long id) {
		// TODO Auto-generated method stub
		if(flag == 1) {
			Admin ad = null;
			ad = adminRepository.findById(id).orElseThrow(()-> new AdminNotFoundException("Admin not found"));
			this.adminRepository.delete(ad);
			return ResponseEntity.ok().build();
		}else {
			throw new AdminNotFoundException("Admin is not logged in.");
		}
	}

	@Override
	public List<TripBooking> getAllTrips() {
		// TODO Auto-generated method stub
		if(flag == 1) {
			List<TripBooking> tripList = iTripBookingRepository.findAll();
			return tripList;
		}else {
			throw new AdminNotFoundException("Admin is not logged in.");
		}
	}

	@Override
	public List<TripBooking> getTripsCabwise(int cabId) {
		// TODO Auto-generated method stub
		if(flag == 1) {
			List<TripBooking> tripList = new ArrayList<TripBooking>();
			List<TripBooking> findAllTrip = iTripBookingRepository.findAll();
			for(int i=0; i<findAllTrip.size();i++) {
				if(findAllTrip.get(i).getDriver().getCab().getCabId() == cabId) {
					tripList.add(findAllTrip.get(i));
				}
			}
			return tripList;
		}else {
			throw new AdminNotFoundException("Admin is not logged in.");
		}
	}

	@Override
	public List<TripBooking> getTripsCustomerwise(long customerId) {
		// TODO Auto-generated method stub
		if(flag == 1) {
			List<TripBooking> tripList = new ArrayList<TripBooking>();
			List<TripBooking> findAllTrip = iTripBookingRepository.findAll();
			for(int i=0; i<findAllTrip.size(); i++) {
				if(findAllTrip.get(i).getCustomer().getCustomerId() == customerId) {
					tripList.add(findAllTrip.get(i));
				}
			}
			return tripList;
		}else {
			throw new AdminNotFoundException("Admin is not logged in.");
		}
	}

	@Override
	public List<TripBooking> getTripsDatewise(String date) {
		// TODO Auto-generated method stub
		if(flag == 1) {
			List<TripBooking> tripList = iTripBookingRepository.findAll();
			List<TripBooking> tripList_1 = new ArrayList<TripBooking>();
			
			for(int i=0; i<tripList.size(); i++) {
				String formatDateTime = tripList.get(i).getFromDateTime().format(format);
				if(formatDateTime.equals(date)){
					tripList_1.add(tripList.get(i));
				}
			}
			return tripList_1;
		}else {
			throw new AdminNotFoundException("Admin is not logged in.");
		}
	}

	public List<TripBooking>getAllTripsForDays(long customerId, String fromDate, String toDate) {
		// TODO Auto-generated method stub
		if(flag == 1) {
			List<TripBooking> findAllTrip = iTripBookingRepository.findAll();
			List<TripBooking> tripList = new ArrayList<TripBooking>();
			for(int i=0; i<findAllTrip.size(); i++) {
				if(findAllTrip.get(i).getCustomer().getCustomerId() == customerId) {
					if(findAllTrip.get(i).getFromDateTime().format(format).equals(fromDate) && findAllTrip.get(i).getToDateTime().format(format).equals(toDate)) {
						tripList.add(findAllTrip.get(i));
					}
				}
			}
			
			return tripList;
		}else {
			throw new AdminNotFoundException("Admin is not logged in.");
		}
		
	}

}
