package com.cg.day06.polymorphism;

public class Transaction {

	private int accountNumber;
	
	public Transaction() {
		
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void execute() {
		System.out.println("Processing Transaction...");
	}
}