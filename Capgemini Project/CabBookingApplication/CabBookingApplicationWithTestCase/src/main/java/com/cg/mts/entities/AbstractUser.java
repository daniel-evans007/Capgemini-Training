package com.cg.mts.entities;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * @author Bikramjit
 *
 */
@MappedSuperclass
public abstract class AbstractUser {
	
	private String username;
	@NotBlank(message = "Password is mandatory")
	private String password;
	private String mobileNumber;
	@Email
	private String email;
	
	public AbstractUser() {

	}


	public AbstractUser( String username, String password, String mobileNumber, String email) {

		this.username = username;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}