package com.cg.mts.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin extends AbstractUser {
	

	public Admin() {
		super();
	}

	
	public Admin(long joinId, String username, String password, String mobileNumber, String email) {
		super(joinId, username, password, mobileNumber, email);
		// TODO Auto-generated constructor stub
	}
	
	
}