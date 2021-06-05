package com.cg.lab_04.exercise1;

public class Account {

	private long accNum;
	private double balance;
	private Person accHolder;
	
	public Account() {
		
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
}