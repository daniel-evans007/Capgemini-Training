package com.cg.day9_collections.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	public static String validateId(String id) throws CustIDException {
		String regex = "^.+[0-9]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(String.valueOf(id));
		
		if (matcher.matches() && id != null) {
			return id;
		}
		else {
			throw new CustIDException("Invalid Customer ID");
		}
	}
	
	public static String validateName(String name) throws CustNameException {
		String regex = "^[a-zA-Z].{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(String.valueOf(name));
		
		if (matcher.matches() && name != null) {
			return name;
		}
		else {
			throw new CustNameException("Invalid Customer Name");
		}
	}
	
	public static int validateAge(int age) throws CustAgeException {
		String regex = "[0-9]{2}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(String.valueOf(age));
		
		if (matcher.matches() && age !=0 && age > 0 && age < 100) {
			return age;
		}
		else {
			throw new CustAgeException("Invalid Age");
		}
	}
	
	public static String validateEmail(String email) throws CustEmailException {
		String regex = "[a-zA-z0-9.]+@[a-zA-Z0-9]+\\.[a-z]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(String.valueOf(email));
		
		if (matcher.matches() && email != null) {
			return email;
		}
		else {
			throw new CustEmailException("Invalid Email Address");
		}
	}
	
	public static String validatePhoneNumber(String phoneNumber) throws CustPhoneException {
		String regex = "[0-9]{10}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(String.valueOf(phoneNumber));
		
		if (matcher.matches() && phoneNumber != null) {
			return phoneNumber;
		}
		else {
			throw new CustPhoneException("Invalid Phone Number");
		}
	}

	@Override
	public String toString() {
		return "Customer [ID = " + cid + ", Name = " + custName + ", Age = " + age + ", D.O.B = " + dob + ", Email = " + email
				+ ", Phone Number = " + phoneNumber + "]";
	}
}