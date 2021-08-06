package com.cg.mts.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author Bikramjit
 *
 */
@Entity
public class Admin extends AbstractUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "admin_Sequence")
    @SequenceGenerator(name = "admin_Sequence", sequenceName = "ADMIN_SEQ", initialValue = 1001)
	private long adminId;
	
	public Admin() {
		super();
	}


	public Admin(String username, String password, String mobileNumber, String email, long adminId) {
		super(username, password, mobileNumber, email);
		this.adminId = adminId;
	}



	public long getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	
	
}