package com.cg.bookapp.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.bookapp.exception.ArrayListIsNull;
import com.cg.bookapp.exception.BookAlreadyFoundException;
import com.cg.bookapp.exception.BookNotFoundException;
import com.cg.bookapp.model.Book;

public class BookManager {

	Scanner sc = new Scanner(System.in);
	
	public BookManager() {
		
	}
	
	ArrayList<Book> bookList = new ArrayList<Book>();
	
	public void addBook(int bId, String bName, double price) throws BookAlreadyFoundException {
		Book book = new Book(bId, bName, price);
		checkIfBookAlreadyExists(book);
		bookList.add(book);
	}

	private void checkIfBookAlreadyExists(Book book) throws BookAlreadyFoundException {
		if (bookList.contains(book)) {
			throw new BookAlreadyFoundException("Book already exists in the list");
		}
	}
	
	public void getAllBooks() throws ArrayListIsNull {
		if (bookList.size() == 0) {
			throw new ArrayListIsNull("There are no books to print");
		}
		else {
			for (int i=0; i<bookList.size();i++) {
				System.out.println(bookList.get(i));
			}
		}
	}
	
	public ArrayList<Book> updateBookDetails() throws BookNotFoundException {
		System.out.println("Enter Book ID: ");
		int bId = Integer.parseInt(sc.nextLine());
		for (int i=0;i<bookList.size();i++) {
			if (bookList.get(i).getbId() == bId) {
				System.out.println("Enter 1 to update Book Name");
				System.out.println("Enter 2 to update Book Price");
				System.out.print("Enter choice: ");
				int choice = Integer.parseInt(sc.nextLine());
				
				switch (choice) {
				case 1:
					System.out.print("Enter the new Book Name: ");
					String bName = sc.nextLine();
					bookList.get(i).setbName(bName);
					break;
				case 2:
					System.out.print("Enter the new Book Price: ");
					double price = Double.parseDouble(sc.nextLine());
					bookList.get(i).setPrice(price);
					break;
				}
			}
			else {
				throw new BookNotFoundException("Book doesn't exist");
			}
		}
		return bookList;
	}
	
	public void deleteBook() throws BookNotFoundException {
		System.out.print("Enter Book ID of the book to be deleted: ");
		int bId = Integer.parseInt(sc.nextLine());
		
		for (int i=0;i<bookList.size();i++) {
			if (bookList.get(i).getbId() == bId) {
				System.out.println("Removing "+bookList.get(i).getbName());
				bookList.remove(i);
			}
			else {
				throw new BookNotFoundException("Book doesn't exist");
			}
		}
	}
}