package com.cg.mts.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.AbstractUser;
import com.cg.mts.entities.Admin;
import com.cg.mts.entities.TripBooking;
import com.cg.mts.exception.AdminNotFoundException;
import com.cg.mts.repository.IAbstractUserRepository;
import com.cg.mts.repository.IAdminRepository;
//import com.cg.mts.repository.IAdminRepository;
@Service
public class AdminService implements IAdminService{

	@Autowired
	private IAdminRepository adminRepository;
	//private IAbstractUserRepository iAbstractUserRepository;
	
	@Override
	public Admin insertAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return (Admin) this.adminRepository.save(admin);
	}

	@Override
	public Admin updateAdmin(Admin admin,long id) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		Admin ad = null;
		ad = adminRepository.findById(id).orElseThrow(()-> new AdminNotFoundException("Admin not found"));
		this.adminRepository.delete(ad);
		return ResponseEntity.ok().build();
	}

	@Override
	public List<TripBooking> getAllTrips(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TripBooking> getTripsCabwise() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TripBooking> getTripsCustomerwise() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TripBooking> getTripsDatewise() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TripBooking> getAllTripsForDays(int customerId, LocalDateTime fromDate, LocalDateTime toDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
