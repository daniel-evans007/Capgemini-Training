package com.cg.junit.contactmanager;

public class MainContact {

	public static void main(String[] args) {
		
		Contact contact = new Contact();
		
		contact.readDetails();
		
		System.out.println(contact.displayDetails());
	}
}