package com.cg.bookapp;

import java.util.Scanner;

import com.cg.bookapp.exception.ArrayListIsNull;
import com.cg.bookapp.exception.BookAlreadyFoundException;
import com.cg.bookapp.exception.BookNotFoundException;
import com.cg.bookapp.service.BookManager;

public class BookMain {

	static Scanner sc = new Scanner(System.in);
	private static int bId;
	private static String bName;
	private static double price;
	
	public static void main(String[] args) throws BookAlreadyFoundException, ArrayListIsNull, BookNotFoundException {
		
		BookManager bm = new BookManager();
		
		int option;
		String choice = "yes";
		
		while (choice.equalsIgnoreCase("yes")) {
			System.out.println("Enter 1 to Create a Book and add it to the list");
			System.out.println("Enter 2 to Read the list of books");
			System.out.println("Enter 3 to Update different parameters of a particular book");
			System.out.println("Enter 4 to Delete an existing book");
			
			System.out.print("Enter your choice: ");
			option = Integer.parseInt(sc.nextLine());
			
			switch (option) {
			case 1:
				readBookDetails();
				bm.addBook(bId, bName, price);
				break;
			case 2:
				bm.getAllBooks();
				break;
			case 3:
				bm.updateBookDetails();
				break;
			case 4:
				bm.deleteBook();
				break;
			default:
				System.out.println("Invalid choice...");
			}
			
			System.out.println("Do you want to continue, yes or no");
			choice = sc.nextLine();
			if (!choice.equalsIgnoreCase("yes")) {
				System.out.println("Exiting Program successfully...");
				System.exit(0);
			}
		}	
	}

	private static void readBookDetails() {
		System.out.println("Enter the details of the book");
		System.out.print("\nEnter Book ID: ");
		bId = Integer.parseInt(sc.nextLine());
		System.out.print("\nEnter Book Name: ");
		bName = sc.nextLine();
		System.out.print("\nEnter Book price: ");
		price = Double.parseDouble(sc.nextLine());
	}
}