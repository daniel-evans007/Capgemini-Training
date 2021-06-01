package com.cg.bookapp.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

	static Book book;
	static Book book1;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		book = new Book(101, "Angels and Demons", 245.0);
		//book1 = new Book();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		book = null;
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Running Test Case");
		book1 = new Book();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("End of Test Case");
		book1 = null;
	}
	
	@Test
	void testBook() {
		assertEquals(new Book(), book1);
	}
	
	@Test
	void testGetBookId() {
		assertEquals(101, book.getbId());
	}
	
	@Test
	void testGetBookName() {
		assertEquals("Angels and Demons", book.getbName());
	}
	
	@Test
	void testGetBookPrice() {
		assertEquals(245.0, book.getPrice());
	}
}
