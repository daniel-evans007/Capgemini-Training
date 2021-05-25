package com.cg.day9_collections.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		String wish;
		
		do {
			System.out.println("Enter 1 for adding new Customers: ");
			System.out.println("Enter 2 for removing Customers: ");
			System.out.println("Enter 3 for displaying all the Customers: ");
			System.out.print("Enter your Choice: ");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch (choice) {
			case 1:
					
				
			System.out.println("\nDo you want to continue, yes or no?");
			wish = sc.nextLine();
				
			if (!wish.equalsIgnoreCase("yes") == true) {
				System.out.println("Exiting after successful completion...");
				System.exit(0);
			}
			
		} while(wish.equalsIgnoreCase("yes") == true);
		
		sc.close();
	}
}