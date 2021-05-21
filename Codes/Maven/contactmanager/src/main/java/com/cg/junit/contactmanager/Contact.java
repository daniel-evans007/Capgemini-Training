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

	public void validateFirstName() {
		if(this.firstName == null) {
			throw new RuntimeException("First Name cannot be null");
		}
	}

		public void validateLastName() {
			if(this.lastName == null) {
				throw new RuntimeException("Last Name cannot be null");
			}
	}
	
	public void validateMobileNo() {
		if(this.mobileNo.length() != 10) {
			throw new RuntimeException("mobileNo cannot be less than 10 digits");
		}
		if(! this.mobileNo.matches("\\d+")) {
			throw new RuntimeException("mobileNo can contain only digits");
		}
		if(!this.mobileNo.startsWith("0")) {
			throw new RuntimeException("mobileNo should start with 0");
		}
	}
	
	public void readDetails() {
		System.out.println("Enter the details of Contact");
		
		System.out.print("Enter the firstName ");
		firstName = sc.nextLine();
		
		System.out.print("Enter the lastName: ");
		lastName = sc.nextLine();
		
		System.out.print("Enter the mobileNo: ");
		mobileNo = sc.nextLine();
	}
	
	public String displayDetails() {
		return "\nThe Contact Details are = " + firstName + "\t" + lastName +"\t" +mobileNo;
	}	
}