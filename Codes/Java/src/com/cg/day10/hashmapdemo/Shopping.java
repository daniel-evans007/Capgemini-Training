package com.cg.day10.hashmapdemo;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Shopping {

	public static void main(String[] args) throws IOException {
		
		HashMap<String, String> shoppingList = new HashMap<String, String>();
		Set<Entry<String, String>> shoppingKeyValueSet = shoppingList.entrySet();
		Scanner sc = new Scanner(System.in);
		
		String id;
		String nameOfItem;
		String wish;
		
		do {
			System.out.println("Enter 1 to add items to Shopping List.");
			System.out.println("Enter 2 to read the KeySet.");
			System.out.println("Enter 3 to read the Values");
			System.out.println("Enter 4 to read the EntrySet");
			System.out.println("Enter 5 to replace the value of an exisiting key with a different value");
			System.out.println("Enter 6 to sort the values");
			
			System.out.print("\nEnter your choice: ");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch (choice) {
			case 1:
				System.out.print("\nEnter the ID: ");
				id = sc.nextLine();
				System.out.print("\nEnter the Name: ");
				nameOfItem = sc.nextLine();
				
				shoppingList.put(id, nameOfItem);
				break;
			case 2:
				Set<String> shoppingKeySet = shoppingList.keySet();
				System.out.println("Key Values of above Hash Map = "+shoppingKeySet);
				break;
			case 3:
				Collection<String> shoppingValueSet = shoppingList.values();
				System.out.println("Values of above Hash Map = "+shoppingValueSet);
				break;
			case 4:
				System.out.println("Key, Value pairs of the above HashMap: "+shoppingKeyValueSet);
				break;
			case 5:
				System.out.print("\nEnter the ID: ");
				id = sc.nextLine();
				System.out.print("\nEnter the New Name: ");
				nameOfItem = sc.nextLine();
				
				shoppingList.replace(id, nameOfItem);
				System.out.println("Key, Value pairs of the above HashMap: "+shoppingKeyValueSet);
				break;
			case 6:
				System.out.print("Here's the sorted list: ");
				
				Map<String, String> shoppingListSorted = new TreeMap<String, String>();
				shoppingListSorted.putAll(shoppingList);
				
				System.out.println(shoppingListSorted);
				break;
			default:
					System.out.println("Invalid Choice :(");
			}
			
			System.out.print("Do you wish to continue, yes or no?\nResponse: ");
			wish = sc.nextLine();
			
			if (!wish.equalsIgnoreCase("yes") == true) {
				System.out.println("Exiting Program...");
				System.exit(0);
			}
		} while (wish.equalsIgnoreCase("yes") == true);
		
		sc.close();
	}
}