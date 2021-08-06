package com.cg.mts.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author Anirban
 *
 */
@Entity
public class Customer extends AbstractUser{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "customer_Sequence")
    @SequenceGenerator(name = "customer_Sequence", sequenceName = "CUSTOMER_SEQ", initialValue = 201)
	private long customerId;
	


	public Customer() {
		super();
	}

	public Customer(long joinId, String username, String password, String mobileNumber, String email, long customerId) {
		super(username, password, mobileNumber, email);
		this.customerId = customerId;
	}

	
	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
}
