package com.cg.day06.polymorphism;

public class BalanceInquiry extends Transaction {
	
	public static double balance;
	
	public BalanceInquiry() {
		
	}
	
	@Override
	public void execute() {
		System.out.print("\nBalance is: "+balance);
	}
}