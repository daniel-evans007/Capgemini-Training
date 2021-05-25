package com.cg.day9_collections.homework;

public class Customer {

	private String cid;
	private String custName;
	private int age;
	private String dob;
	private String email;
	private String phoneNumber;
	
	public Customer() {
		
	}

	public Customer(String cid, String custName, int age, String dob, String email, String phoneNumber) {
		super();
		this.cid = cid;
		this.custName = custName;
		this.age = age;
		this.dob = dob;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}