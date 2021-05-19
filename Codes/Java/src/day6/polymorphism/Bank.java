package day6.polymorphism;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Balance to begin with: ");
		BalanceInquiry balance = new BalanceInquiry();
		
		BalanceInquiry.balance = sc.nextDouble();
		
		balance.execute();
		
		System.out.print("\nEnter the amount to be deposited: ");
		Deposit deposit = new Deposit(sc.nextDouble());
		
		deposit.execute();
		balance.execute();
		
		System.out.print("\n\nEnter the amount to be withdrawn: ");
		Withdrawal withdrawal = new Withdrawal(sc.nextDouble());
		
		withdrawal.execute();
		balance.execute();
		
		sc.close();
	}
}