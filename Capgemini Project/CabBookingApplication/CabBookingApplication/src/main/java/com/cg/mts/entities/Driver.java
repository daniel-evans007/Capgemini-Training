package com.cg.mts.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Driver extends AbstractUser {
	
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "driver_Sequence")
//  @SequenceGenerator(name = "drive_Sequence", sequenceName = "DRIVER_SEQ", initialValue = 101)
//	private int driverId;
	
	private String licenseNo;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "cabId")
	private Cab cab;
	
	private float rating;
	
	@OneToMany(targetEntity = TripBooking.class)
	@JoinColumn(name = "tripBookingId")
	private List<TripBooking> tripBooking;
	
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	


public Driver(long Id, String username, String password, String mobileNumber, String email, String licenseNo,
			Cab cab, float rating, List<TripBooking> tripBooking) {
		super(Id, username, password, mobileNumber, email);
		this.licenseNo = licenseNo;
		this.cab = cab;
		this.rating = rating;
		this.tripBooking = tripBooking;
	}






//int driverId,
//	public int getDriverId() {
//		return driverId;
//	}
//
//	public void setDriverId(int driverId) {
//		this.driverId = driverId;
//	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public Cab getCab() {
		return cab;
	}

	public void setCab(Cab cab) {
		this.cab = cab;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public List<TripBooking> getTripBooking() {
		return tripBooking;
	}

	public void setTripBooking(List<TripBooking> tripBooking) {
		this.tripBooking = tripBooking;
	}
	
}