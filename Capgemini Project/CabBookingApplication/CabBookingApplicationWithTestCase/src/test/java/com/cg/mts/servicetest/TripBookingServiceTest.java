package com.cg.mts.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.mts.entities.Cab;
import com.cg.mts.entities.Customer;
import com.cg.mts.entities.Driver;
import com.cg.mts.entities.TripBooking;
import com.cg.mts.repository.ITripBookingRepository;
import com.cg.mts.service.TripBookingService;

/**
 * @author Niharika
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TripBookingServiceTest {
	@Autowired
	private TripBookingService tripBookingService;
	
	@MockBean
	private ITripBookingRepository tripBookingRepo;
	
	
	  @Test 
	  public void insertTripBookingTest(){ 
	  LocalDateTime fromdate=LocalDateTime.of(2017,01,25,10,30); 
	  LocalDateTime todate=LocalDateTime.of(2017,01,25,12,30); 
	  Cab cab= new Cab(10001,"sedan",20.50f);
	  Driver driver = new Driver(301,"mukesh","abcd","7594621835","mukesh@gmail.com",101,"845762",cab,4.6f);
	  Customer customer = new Customer(201,"Rishi","xyza","8695423657","rishi@gmail.com",201);
	  TripBooking tb = new TripBooking(101,customer,driver,"Phoolbagan","Airport",fromdate,todate,true,10.5f,257.50f); 
	  Mockito.when(tripBookingRepo.save(tb)).thenReturn(tb);
	  assertEquals(tb, tripBookingService.insertTripBooking(tb));
	  
	  }
	  
	@Test
	public void updateTripBookingTest(){
		  LocalDateTime fromdate=LocalDateTime.of(2017,01,25,10,30); 
		  LocalDateTime todate=LocalDateTime.of(2017,01,25,12,30); 
		  Cab cab= new Cab(10001,"sedan",20.50f);
		  Driver driver = new Driver(301,"mukesh","abcd","7594621835","mukesh@gmail.com",101,"845762",cab,4.6f);
		  Customer customer = new Customer(201,"Rishi","xyza","8695423657","rishi@gmail.com",201);
		  TripBooking tripBooking= new TripBooking(101,customer,driver,"Phoolbagan","Airport",fromdate,todate,true,10.5f,257.50f);
		  TripBooking newtripBooking= new TripBooking(101,customer,driver,"Baguiati","Airport",fromdate,todate,true,5.5f,100.50f);
		  tripBookingRepo.save(tripBooking);
		  given(tripBookingRepo.findById(101)).willReturn(Optional.of(newtripBooking));
		  List<TripBooking> tripbookingList =  tripBookingRepo.findAll();
		  for(int i=0; i<tripbookingList.size(); i++) {
			  if(tripbookingList.get(i).getTripBookingId() == newtripBooking.getTripBookingId()) {
			
				  assertEquals(newtripBooking, tripbookingList.get(i));
			  }
		  }
	}
	
	@Test
	public void deleteTripBookingTest(){
		  LocalDateTime fromdate=LocalDateTime.of(2017,01,25,10,30); 
		  LocalDateTime todate=LocalDateTime.of(2017,01,25,12,30); 
		  Cab cab= new Cab(10001,"sedan",20.50f);
		  Driver driver = new Driver(301,"mukesh","abcd","7594621835","mukesh@gmail.com",101,"845762",cab,4.6f);
		  Customer customer = new Customer(201,"Rishi","xyza","8695423657","rishi@gmail.com",201);
		  TripBooking tripBooking= new TripBooking();
		  tripBooking.setTripBookingId(101);
		  Mockito.when(tripBookingRepo.findById(tripBooking.getTripBookingId())).thenReturn(Optional.of(tripBooking));
		  tripBookingService.deleteTripBooking(tripBooking.getTripBookingId());
		  verify(tripBookingRepo).deleteById(tripBooking.getTripBookingId());
			
		  
	}
	
	@Test
	public void viewAllTripsCustomerTest(){
		  LocalDateTime fromdate=LocalDateTime.of(2017,01,25,10,30); 
		  LocalDateTime todate=LocalDateTime.of(2017,01,25,12,30); 
		  Cab cab= new Cab(10001,"sedan",20.50f);
		  Driver driver = new Driver(301,"mukesh","abcd","7594621835","mukesh@gmail.com",101,"845762",cab,4.6f);
		  Customer customer = new Customer(201,"Rishi","xyza","8695423657","rishi@gmail.com",201);
		  TripBooking tripBooking= new TripBooking(101,customer,driver,"Phoolbagan","Airport",fromdate,todate,true,10.5f,257.50f);
		  List<TripBooking> tripBookingList= new ArrayList<TripBooking>();
		  tripBookingList.add(tripBooking);
		  Mockito.when(tripBookingRepo.findAll()).thenReturn(tripBookingList);
		  tripBookingService.viewAllTripsCustomer(tripBookingList.get(0).getTripBookingId());
		  verify(tripBookingRepo).findAll();
			
	}
	
	/*
	 * @Test public void calculateBillTest() { LocalDateTime
	 * fromdate=LocalDateTime.of(2017,01,25,10,30); LocalDateTime
	 * todate=LocalDateTime.of(2017,01,25,12,30); Cab cab= new
	 * Cab(10001,"sedan",20.50f); Driver driver = new
	 * Driver(301,"mukesh","abcd","7594621835","mukesh@gmail.com",101,"845762",cab,4
	 * .6f); Customer customer = new
	 * Customer(201,"Rishi","xyza","8695423657","rishi@gmail.com",201); TripBooking
	 * tripBooking= new
	 * TripBooking(101,customer,driver,"Phoolbagan","Airport",fromdate,todate,true,
	 * 10.5f,257.50f); List<TripBooking> tripBookingList= new
	 * ArrayList<TripBooking>(); tripBookingList.add(tripBooking);
	 * Mockito.when(tripBookingRepo.findAll()).thenReturn(tripBookingList);
	 * tripBookingService.calculateBill(tripBookingList.get(0).getCustomer().
	 * getCustomerId()); verify(tripBookingRepo).findAll();
	 * 
	 * }
	 */
}
