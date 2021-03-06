package com.cg.vegetables;

import java.util.Arrays;
import java.util.Scanner;

import com.cg.vegetable.service.VegetableManager;

public class VegetableMain {
	
	private static String vegId;
	private static String vegName;
	private static int vegPrice;
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		VegetableManager vm = new VegetableManager();
		
		int option;
		String choice = "yes";
		
		while (choice.equalsIgnoreCase("yes")) {
			System.out.println("Enter 1 to Create a Vegetable and add it to the list");
			System.out.println("Enter 2 to Read the list of Vegetables");
			System.out.println("Enter 3 to Update different parameters of a particular Vegetable");
			System.out.println("Enter 4 to Delete an existing Vegetable");
			System.out.println("Enter 5 to Sort the list of Vegetables");
			
			System.out.print("\nEnter your choice: ");
			option = Integer.parseInt(sc.nextLine());
			
			switch (option) {
			case 1:
				readVegDetails();
				vm.addVeg(vegId, vegName, vegPrice);
				break;
			case 2:
				System.out.println(Arrays.toString(vm.getAllVegetables().toArray()));
				break;
			case 3:
				vm.updateVegDetails();
				break;
			case 4:
				vm.deleteVegetable();
				break;
			case 5:
				System.out.println("Do you want to sort using ID, Name or Price");
				System.out.println("Enter 1 for ID");
				System.out.println("Enter 2 for Name");
				System.out.println("Enter 3 for Price");
				System.out.print("\nEnter choice: ");
				int ch = Integer.parseInt(sc.nextLine());
				
				switch (ch) {
				case 1:
					vm.sortVegetableList();
					break;
				case 2:
					vm.sortVegUsingVegName();
					break;
				case 3:
					vm.sortVegUsingVegPrice();
					break;
				default:
					System.out.println("Invalid input");
				}
				
			default:
				System.out.println("Invalid choice...");
			}
			
			System.out.print("\nDo you want to continue, yes or no: ");
			choice = sc.nextLine();
			
			if (!choice.equalsIgnoreCase("yes")) {
				System.out.println("\nExiting Program successfully...");
				System.exit(0);
			}
			System.out.println();
		}	
	}
	
	public static void readVegDetails() {
		System.out.println("\nEnter details of the vegetable");
		System.out.print("\nEnter Veg ID: ");
		vegId = sc.nextLine();
		System.out.print("Enter Veg Name: ");
		vegName = sc.nextLine();
		System.out.println("Enter Veg Price: ");
		vegPrice = Integer.parseInt(sc.nextLine());
	}
}