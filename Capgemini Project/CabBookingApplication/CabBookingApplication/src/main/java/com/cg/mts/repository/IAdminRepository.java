package com.cg.mts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import java.time.LocalDateTime;
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Admin;
//
//import com.cg.mts.entities.AbstractUser;
//import com.cg.mts.entities.TripBooking;
  import com.cg.mts.exception.AdminNotFoundException;
//import com.cg.mts.exception.CustomerNotFoundException;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, Long>{
	
//	public Admin insertAdmin(Admin admin);
	
//	@Query("UPDATE Admin a SET a.username = : username, a.password = : password, a.email = : email, a.mobile_number = :mobile WHERE a.id = : id  ")
//	public Admin updateAdmin(String username,String password, String email,String mobile,long id) throws AdminNotFoundException;
	
//	public Admin deleteAdmin(int adminId) throws AdminNotFoundException;
//	public List<TripBooking>getAllTrips(int customerId) throws CustomerNotFoundException;
//	public List<TripBooking>getTripsCabwise();
//	public List<TripBooking>getTripsCustomerwise();
//	public List<TripBooking>getTripsDatewise();
//	public List<TripBooking>getAllTripsForDays(int customerId, LocalDateTime fromDate, LocalDateTime toDate) throws CustomerNotFoundException;
}