package com.cg.day7.abstraction_example;

import java.util.Scanner;

public class MainAbsClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char ch = 'y';
		
		SavingsAccount sa = new SavingsAccount();
		
		while (ch == 'y') {
			System.out.println("Enter the choice: ");
			System.out.println("addMoney");
			System.out.println("withDrawMoney");
			System.out.println("checkBal");
			String option = sc.next();
			
			switch (option) {
			case "addMoney":
				sa.addMoney();
				break;
			case "withDrawMoney":
				sa.withDraw();
				break;
			case "checkBal":
				sa.checkBalance();
				break;
			default:
				System.out.println("Not valid option");
			}
			
			System.out.println("do you want to continue");
			ch = sc.next().trim().charAt(0);
		}
		
		sc.close();
	}
}