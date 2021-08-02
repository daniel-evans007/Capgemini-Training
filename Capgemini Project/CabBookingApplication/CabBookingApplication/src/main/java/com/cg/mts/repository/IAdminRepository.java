package com.cg.mts.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Admin;
import com.cg.mts.entities.TripBooking;
import com.cg.mts.exception.AdminNotFoundException;
import com.cg.mts.exception.CabNotFoundException;
import com.cg.mts.exception.CustomerNotFoundException;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, Long>{
//	public Admin insertAdmin(Admin admin);
//	public Admin updateAdmin(Admin admin) throws AdminNotFoundException;
//	public Admin deleteAdmin(int adminId) throws AdminNotFoundException;
//	public List<TripBooking>getAllTrips();
//	public List<TripBooking>getTripsCabwise(int cabId) throws CabNotFoundException;
//	public List<TripBooking>getTripsCustomerwise(int customerId)throws CustomerNotFoundException;
//	public List<TripBooking>getTripsDatewise();
//	public List<TripBooking>getAllTripsForDays(int customerId, LocalDateTime fromDate, LocalDateTime toDate) throws CustomerNotFoundException;
}