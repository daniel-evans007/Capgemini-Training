package com.cg.cmapp;

import java.util.Scanner;

import com.cg.cmapp.service.ContactManager;

public class ContactMain {

	static Scanner sc = new Scanner(System.in);
	static String fName;
	static String lName;
	static String phNo;
	
	public static void main(String[] args) {
				
		ContactManager cm = new ContactManager();
		
		char choice = 'y';
		while (choice == 'y') {
			System.out.println("a: add contact");
			System.out.println("g: get contact");
			System.out.println("f: find contact");
			System.out.println("u: update contact");
			System.out.println("d: delete contact");
			System.out.print("Enter the choice: ");
			char ch = sc.next().trim().charAt(0);
			switch (ch) {
			case 'a' :
				readDetails();
				cm.addContact(fName, lName, phNo);
				break;
			case 'g' :
				cm.getAllContacts();
				break;
			case 'f' :
				System.out.println("Code to find a contact by key");
				break;
			case 'd' :
				System.out.println("Code to remove a contact by key");
				break;
			}
			System.out.println("Do you want to continue, y or n");
			choice = sc.next().trim().charAt(0);
			if (choice != 'y') {
				System.out.println("Exiting Program");
				System.exit(0);
			}
		}
	}
	
	public static void readDetails() {
		System.out.println("Enter the Contact details");
		System.out.print("Enter the first name: ");
		fName = sc.next();
		System.out.print("\nEnter the last name: ");
		lName = sc.next();
		System.out.println("\nEnter the phone no: ");
		phNo = sc.next();
	}
}