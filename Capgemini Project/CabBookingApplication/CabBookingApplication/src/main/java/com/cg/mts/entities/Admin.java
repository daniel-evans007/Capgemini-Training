package com.cg.mts.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin extends AbstractUser {
	
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "admin_Sequence")
//    @SequenceGenerator(name = "admin_Sequence", sequenceName = "ADMIN_SEQ", initialValue = 2001)
//	private int adminId;
	
	public Admin() {
		super();
	}


//	public Admin(long joinId, String username, String password, String mobileNumber, String email, int adminId) {
//		super(joinId, username, password, mobileNumber, email);
//		this.adminId = adminId;
//	}
	
	public Admin(long joinId, String username, String password, String mobileNumber, String email) {
		super(joinId, username, password, mobileNumber, email);
		// TODO Auto-generated constructor stub
	}


//	public int getAdminId() {
//		return adminId;
//	}


//	public void setAdminId(int adminId) {
//		this.adminId = adminId;
//	}
//	
	
}