package com.cg.lab_09.exercise3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CredValidation cv = (uname, pword) -> {
			return (uname.equals("danny_707") && pword.equals("dan@ani@007"));
		};
		
		System.out.print("Enter Username: ");
		String uname = sc.nextLine();
		
		System.out.print("Enter Username: ");
		String pword = sc.nextLine();
		
		
		System.out.println("Authentication Status: "+cv.credentialValidation(uname, pword));
		
		sc.close();
	}
}