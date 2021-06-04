package com.cg.day06.polymorphism;

public class Deposit extends Transaction {

	private double amount;
	
	public Deposit(double amount) {
		this.amount = amount;
	}
	
	@Override
	public void execute() {
		System.out.print("\nAmount Deposited is: "+amount);
		BalanceInquiry.balance += amount;
	}
}