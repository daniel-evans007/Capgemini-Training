package com.cg.mts.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer extends AbstractUser{
	
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "customer_Sequence")
//  @SequenceGenerator(name = "customer_Sequence", sequenceName = "CUSTOMER_SEQ", initialValue = 201)
	//private int customerId;

	@OneToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name="tripBookingId")
	private TripBooking tripBooking; 
	
	public Customer() {
		super();
	}

	public Customer(long Id, String username, String password, String mobileNumber, String email,
			TripBooking tripBooking) {
		super(Id, username, password, mobileNumber, email);
		this.tripBooking = tripBooking;
	}

	public TripBooking getTripBooking() {
		return tripBooking;
	}

	public void setTripBooking(TripBooking tripBooking) {
		this.tripBooking = tripBooking;
	}


/*	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	} */
}
