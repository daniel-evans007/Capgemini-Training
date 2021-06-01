package com.cg.day11.author;

import java.util.Scanner;

public class AuthorMain {

	static Scanner sc = new Scanner(System.in);
	private static String name;
	private static String email;
	private static char gender;
	
	public static void main(String[] args) {
		
		AuthorManager am = new AuthorManager();
		String choice = "yes";
		
		while (choice.equalsIgnoreCase("yes")) {
			System.out.println("add: to add author");
			System.out.println("get: to get author");
			System.out.print("Enter the choice: ");
			String option = sc.nextLine();
			
			switch(option) {
			case "add":
				readDetails();
				am.addAuthor(name, email, gender);
				break;
			case "get":
				am.getAllAuthors();
				break;
			}
			
			System.out.println("Do you want to continue? Yes or No...");
			choice = sc.nextLine();
			
			if (!choice.equalsIgnoreCase("yes")) {
				System.out.println("Exiting Program successfully...");
				System.exit(0);
			}
		}
	}

	private static void readDetails() {
		System.out.println("Enter the Author details: ");
		System.out.print("Enter the first name: ");
		name = sc.nextLine();
		System.out.print("Enter the email address: ");
		email = sc.nextLine();
		System.out.print("Enter the Gender (m/f/u): ");
		gender = sc.next().trim().charAt(0);
	}
}