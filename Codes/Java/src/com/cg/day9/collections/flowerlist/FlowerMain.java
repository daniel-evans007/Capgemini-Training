package com.cg.day9.collections.flowerlist;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class FlowerMain {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<Flower> flowerList = new HashSet<Flower>();
		
		
		String wish;
		
		do {
			System.out.println("Enter 1 for adding flowers to the list.");
			System.out.println("Enter 2 for displaying all the flowers.");
			System.out.println("Enter 3 if you want to remove flowers that are not in stock.");
			System.out.print("\nEnter your choice: ");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) {
				case 1:
					System.out.println("Enter the ID, Name, Price/KG and Quantity: ");
					flowerList.add(new Flower(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Integer.parseInt(sc.nextLine())));
					break;
				case 2:
					Iterator<Flower> it = flowerList.iterator();
					if (flowerList.isEmpty()) {
						System.out.println("Nothing to print...");
					}
					else {
						System.out.println("Here are all the flowers: ");
						while(it.hasNext()) {
							System.out.println(it.next());
						}
					}
					break;
				case 3:
					System.out.println("Removing flowers that are not in stock...");
					Iterator<Flower> it2 = flowerList.iterator();
					
					while(it2.hasNext()) {
						Flower fl = it2.next();
						if (fl.getQuantity() == 0) {
							System.out.print("Flower to be removed is: "+fl.getFname());
							it2.remove();
						}
					}
					break;
				default:
					System.out.println("Invalid choice...");
			}
			
			System.out.println("\nDo you want to continue, yes or no?");
			wish = sc.nextLine();
			
			if (!wish.equalsIgnoreCase("yes") == true) {
				System.out.println("Exiting after successful completion...");
				System.exit(0);
			}
			
		} while (wish.equalsIgnoreCase("yes") == true);
		
		sc.close();
	}
}