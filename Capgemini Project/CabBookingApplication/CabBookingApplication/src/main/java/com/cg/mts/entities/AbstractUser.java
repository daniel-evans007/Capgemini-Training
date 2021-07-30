package com.cg.mts.entities;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;


@MappedSuperclass
public abstract class AbstractUser{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "abstractuser_Sequence")
    @SequenceGenerator(name = "abstractuser_Sequence", sequenceName = "ABSTRACTUSER_SEQ")
	private long Id;
	
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="mobile_number")
	private String mobileNumber;
	@Column(name="email")
	private String email;
	
	public AbstractUser() {

	}


	public AbstractUser(long Id, String username, String password, String mobileNumber, String email) {

		this.Id = Id;
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


	public long getId() {
		return Id;
	}

	public void setId(long joinId) {
		this.Id = joinId;
	}
}