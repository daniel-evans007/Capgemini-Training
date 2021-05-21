package com.cg.day8.junit;

import java.util.Scanner;

public class RegisterUser {

	private String firstName;
	private String lastName;
	private String mobileNo;
	private String userName;
	private String password;
	
	Scanner sc = new Scanner(System.in);
	
	public RegisterUser() {
		
	}

	public RegisterUser(String firstName, String lastName, String mobileNo, String userName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.userName = userName;
		this.password = password;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String validateFirstName(String fName) {
		if(fName == null || fName.equals("")) {
			return "First Name cannot be null";
		}
		else {
			return "First Name is valid";
		}
	}
	
	public String validateLastName(String lName) {
		if(lName == null || lName.equals("")) {
			return "Last Name cannot be null";
		}
		else {
			return "Last Name is valid";
		}
	}
	
	public String validateMobileNo(String mobNo) {
		if(mobNo.length() != 10) {
			return "mobileNo cannot be less than 10 digits" ;
		}
		else if(!mobNo.matches("\\d+")) {
			return "mobileNo can contain only digits" ;
		}
		else if(!mobNo.startsWith("0")) {
			return "mobileNo should start with 0";
		}
		else {
			return "Mobile number is valid";
		}
	}
	
	public String validateUserName(String userName) {
		if (userName == null || userName.equals(" ")) {
			return "Username cannot be null.";
		}
		else if (!(userName.contains("-") || userName.contains("_"))) {
			return "Username must contain '-' or '_'";
		}
		else {
			return "Username is valid";
		}
	}
	
	public String validatePassword(String password) {
		if(password == null || password.equals("")) {
			return "Password cannot be null";
		}
		else if(password.length()<=8 && password.length()>=16) {
			return "Password must have minimum of 8 characters and maximum 16 characters";
		}
		else {
			return "Password is valid";
		}
	}
	
	public void registerUser() {
		System.out.println("Enter the details of Contact");
		System.out.println("Enter the firstName ");
		System.out.println(validateFirstName(firstName = sc.nextLine()));
		
		System.out.println("Enter the lastName ");
		System.out.println(validateLastName(lastName = sc.nextLine()));
		
		System.out.println("Enter the mobileNo ");
		System.out.println(validateMobileNo(mobileNo = sc.nextLine()));
		
		System.out.println("Enter Username ");
		System.out.println(validateFirstName(userName = sc.nextLine()));
		
		System.out.println("Enter password ");
		System.out.println(validateLastName(password = sc.nextLine()));
	}
	
	public String displayDetails() {
		return "The details of the contact is = " + firstName + " " + lastName +" " +mobileNo
				+" "+userName+" "+password;
	}
}