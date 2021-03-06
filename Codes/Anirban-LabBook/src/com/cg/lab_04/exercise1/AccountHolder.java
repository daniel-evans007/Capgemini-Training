package com.cg.lab_04.exercise1;

public class AccountHolder {

	public static void main(String[] args) {
		
		Person smith = new Person();
		Person kathy = new Person();
		
		Account smithAcc = new Account();
		Account kathyAcc = new Account();
		
		smithAcc.setAccHolder(smith);
		kathyAcc.setAccHolder(kathy);
		
		smithAcc.setAccNum((int) (100*Math.random()));
		kathyAcc.setAccNum((int) (100*Math.random()));
		
		smithAcc.deposit(2000);
		kathyAcc.deposit(3000);
		
		smithAcc.deposit(2000);
		kathyAcc.withdraw(2000);
		
		System.out.print("Updated balance of Smith's Acc: "+smithAcc.getBalance());
		System.out.print("\nUpdated balance of Kathy's Acc: "+kathyAcc.getBalance());		
	}
}