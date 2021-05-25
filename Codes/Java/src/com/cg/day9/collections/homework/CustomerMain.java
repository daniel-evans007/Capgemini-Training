package com.cg.day9.collections.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) throws CustAgeException, CustIDException, CustNameException, CustEmailException, CustPhoneException {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		String wish;
		String id;
		String name;
		int age;
		String dob;
		String email;
		String phoneNumber;
		
		do {
			System.out.println("Enter 1 for adding new Customers: ");
			System.out.println("Enter 2 for removing Customers: ");
			System.out.println("Enter 3 for displaying all the Customers: ");
			
			System.out.print("\nEnter your Choice: ");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch (choice) {
				case 1:
					try {
						int temp = (int)(Math.random()*1000);
						id = Customer.validateId(Integer.toString(temp));
						
						System.out.print("\nEnter Customer First Name and Last Name: ");
						name = Customer.validateName(sc.nextLine());
						
						System.out.print("\nEnter Customer Age: ");
						age = Customer.validateAge(Integer.parseInt(sc.nextLine()));
						
						System.out.print("\nEnter Customer D.O.B: ");
						dob = sc.nextLine();
						
						System.out.print("\nEnter Customer Email Address: ");
						email = Customer.validateEmail(sc.nextLine());
						
						System.out.print("\nEnter Customer Phone Number: ");
						phoneNumber = Customer.validatePhoneNumber(sc.nextLine());
						
						System.out.println("\nAll the Customer details have been entered\nUnique ID has automatically been generated");
						
						customerList.add(new Customer(id, name, age, dob, email, phoneNumber));
					}
					catch (CustIDException e) {
						System.out.println(e.getMessage());
					}
					catch (CustNameException e) {
						System.out.println(e.getMessage());
					}
					catch (CustAgeException e) {
						System.out.println(e.getMessage());
					}
					catch (CustEmailException e) {
						System.out.println(e.getMessage());
					}
					catch (CustPhoneException e) {
						System.out.println(e.getMessage());
					}
					break;
				case 2:
					System.out.print("Enter the Unique ID of the customer that you want removed: ");
					
					for (Customer customers: customerList) {
						if (customers.getCid().equals(sc.nextLine())) {
							System.out.println(customers.getCid()+" "+customers.getCustName()+" was removed from the list");
							customerList.remove(customers);
							break;
						}
						else {
							System.out.println("ID doesn't belong to any existing Customer");
						}
					}
					break;
				case 3:
					if (customerList.size() != 0) {
						for (Customer customers: customerList) {
							System.out.println(customers);
						}
					}
					else {
						System.out.println("There are no Customers to display");
					}
					break;
				default:
					System.out.println("Invalid Choice");
			}
			System.out.print("\nDo you want to continue, yes or no?\nResponse: ");
			wish = sc.nextLine();
			
			System.out.println();
		
			if (!wish.equalsIgnoreCase("yes") == true) {
				System.out.println("Exiting Program...");
				System.exit(0);
			}
		} while (wish.equalsIgnoreCase("yes") == true);
	
		sc.close();
	}
}