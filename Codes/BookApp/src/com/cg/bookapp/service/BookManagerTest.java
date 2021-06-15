package com.cg.bookapp.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cg.bookapp.exception.ArrayListIsNull;
import com.cg.bookapp.exception.BookAlreadyFoundException;
import com.cg.bookapp.exception.BookIdException;
import com.cg.bookapp.exception.BookNameException;
import com.cg.bookapp.exception.BookPriceException;

class BookManagerTest {

	private BookManager bookManager;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Starting Testing...");

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Testing Ended..."); 
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Instantiating Book Manager");
		bookManager = new BookManager();
	}

	@Test
	@DisplayName("Should create a book")
	void createBook() throws BookAlreadyFoundException, ArrayListIsNull, BookIdException, BookNameException, BookPriceException {
		bookManager.addBook(102, "DaVince Code", 200.0);
		assertEquals(1, bookManager.getAllBooks().size());
	}
	
	@Test
	@DisplayName("Should not create a book when Book ID is less than zero")
	public void shouldThrowRunTimeExceptionWhenBookIDIsLessThanZero() {
		Assertions.assertThrows(BookIdException.class, () -> {
			bookManager.addBook(-1, "DaVince Code", 200.0);
		});
	}
	
	@Test
	@DisplayName("Should not create book when Book Name is null")
	public void shouldThrowRunTimeExceptionWhenBookNameIsNull() {
		Assertions.assertThrows(BookNameException.class, () -> {
			bookManager.addBook(100, null, 200.0);
		});
	}

	@Test
	@DisplayName("Should not create book when Book Price is zero or negative")
	public void shouldThrowRunTimeExceptionWhenBookPriceIsInvalid() {
		Assertions.assertThrows(BookPriceException.class, () -> {
			bookManager.addBook(10, "DaVince Code", -1);
		});
	}
}