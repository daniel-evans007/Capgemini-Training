package com.cg.day07.exception_handling;

import java.util.Scanner;

public class CheckMobNumValidity {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Mobile Number: ");
		String number = sc.nextLine();
		
		try {
			if (number.length() > 10) {
				throw new MobNumberException(number);
			}
		}
		catch (MobNumberException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}