package com.cg.day09.collections.crud;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String wish = new String();
		
		Product product = new Product();
		Product[] productList = new Product[1];
		
		do {
			
			System.out.println("Enter 1 for creating Product");
			System.out.println("Enter 2 for updating Product");
			System.out.println("Enter 3 for deleting a Product");
			System.out.println("Enter 4 for displaying All");
			System.out.println("Enter 5 for displaying by ID");
			
			System.out.println("Enter your choice: ");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) {
			case 1:
				product.createProductList(productList);
				break;
			case 2:
				System.out.print("Enter Product ID: ");
				String id = sc.nextLine();
				
				product.updateProductById(productList, id);
				break;
			case 3:
				System.out.print("Enter Product ID: ");
				String id2 = sc.nextLine();
				
				product.deleteProductById(productList, id2);
				break;
			case 4:
				product.displayProduct(productList);
				break;
			case 5:
				System.out.print("Enter Product ID: ");
				String id3 = sc.nextLine();
				
				product.displayProductById(productList, id3);
				break;
			default :
					System.out.println("Invalid choice");
					
			}
			
			System.out.print("Do you wish to continue, yes or no?");
			wish = sc.nextLine();
			
			if (wish.equalsIgnoreCase("no")) {
				System.exit(0);
			}
			
		} while (wish.equalsIgnoreCase("yes") == true);
		
		sc.close();
	}
}