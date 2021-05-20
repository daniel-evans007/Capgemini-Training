package com.cg.lab_four.exercise1;

public class SavingsAccount extends Account {

	private final double minimumBalance = 500;
	
	@Override
	public void withdraw(double amount) {
		if (super.getBalance() > minimumBalance) {
			super.setBalance(super.getBalance() - amount);
		}
		else {
			System.out.println("Can't withdraw money due to low balance.");
		}
	}
}