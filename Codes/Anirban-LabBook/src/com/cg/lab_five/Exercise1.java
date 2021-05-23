package com.cg.lab_five;

import java.util.Scanner;

@SuppressWarnings("serial")
class AgeException extends Exception {

	public AgeException(String s) {
		super(s);
	}
}

public class Exercise1 {
	
	public static void validateAge(int age) throws AgeException {
		if (age <= 15) {
			throw new AgeException("Age must be above 15 years");
		}
		else {
			System.out.println("Age is perfectly valid");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter age: ");
			int age = sc.nextInt();
			validateAge(age);
		}
		catch (AgeException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}