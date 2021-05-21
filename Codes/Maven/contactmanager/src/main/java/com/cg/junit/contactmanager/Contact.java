package com.cg.junit.contactmanager;

import java.util.Scanner;

public class Contact {

	private String firstName;
	private String lastName;
	private String mobileNo;
	Scanner sc = new Scanner(System.in);

	public Contact() {
		super();
	}

	public Contact(String firstName, String lastName, String mobileNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String validateFirstName(String fName) {
		if (fName == null || fName.equals("")) {
			return "First Name cannot be null";
		}
		else {
			return "First Name is valid";
		}
	}

	public String validateLastName(String lName) {
		if (lName == null || lName.equals("")) {
			return "Last Name cannot be null";
		}
		else {
			return "Last Name is valid";
		}
	}
	
	public String validateMobileNo(String mobNo) {
		if (mobNo.length() != 10) {
			return "mobileNo cannot be less than 10 digits" ;
		}
		else if (!mobNo.matches("\\d+")) {
			return "mobileNo can contain only digits" ;
		}
		else if (!mobNo.startsWith("0")) {
			return "mobileNo should start with 0";
		}
		else {
			return "Mobile number is valid";
		}
	}
	
	public void readDetails() {
		System.out.println("Enter the details of Contact");
		System.out.println("Enter the firstName ");
		System.out.println(validateFirstName(firstName = sc.nextLine()));
		System.out.println("Enter the lastName ");
		System.out.println(validateLastName(lastName = sc.nextLine()));
		System.out.println("Enter the mobileNo ");
		System.out.println(validateMobileNo(mobileNo = sc.nextLine()));
	}
		
	public String displayDetails() {
		return "The details of the contact is = " + firstName + " " + lastName +" " +mobileNo;
	}
}