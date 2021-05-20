package com.cg.day7.abstraction_example;

import java.util.Scanner;

public abstract class BankAccount {

	int accId;
	String accHolderName;
	float minBal;
	float actualBal;
	String address;
	String accType;
	
	Scanner details = new Scanner(System.in);
	
	public BankAccount() {
		super();
		System.out.println("In abstract class constructor");
	}

	public BankAccount(int accId, String accHolderName, float minBal, float actualBal, String address, String accType, Scanner details) {
		super();
		this.accId = accId;
		this.accHolderName = accHolderName;
		this.minBal = minBal;
		this.actualBal = actualBal;
		this.address = address;
		this.accType = accType;
		this.details = details;
	}
	
	public void enterDetailsToOpenAccount() {
		System.out.println("Enter the details to Open an Account");
		
	}

	public abstract void openAccount();
	
	public abstract float calculateInterest();
	
	public abstract void creditAmount();
	
	public abstract void checkBalance();
	
	public abstract void withDraw();
}