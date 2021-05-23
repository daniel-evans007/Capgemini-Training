package com.cg.lab_five;

import java.util.Scanner;

@SuppressWarnings("serial")
class NameException extends Exception {
	
	public NameException(String s) {
		super(s);
	}
}

public class Exercise2 {

	public static void validateName(String name) throws NameException {
		String[] splitname = name.split(" ");
		
		if (splitname[0].length() == 0) {
			throw new NameException("First name cannot be blank");
		}
		else if (splitname.length < 2) {
			throw new NameException("Last name cannot be blank");
		}
		else {
			System.out.println("It's a perfectly valid name");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter name: ");
			String name = sc.nextLine();
			validateName(name);
		}
		catch (NameException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}