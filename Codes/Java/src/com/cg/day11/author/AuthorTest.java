package com.cg.day11.author;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AuthorTest {

	static Author author;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		author = new Author("Mark Twain", "marktwain@twain.com", 'm');
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		author = null;
	}

	@Test
	void testGetName() {
		assertEquals("Mark Twain", author.getName());
	}
	
	@Test
	void testGetEmail() {
		assertEquals("marktwain@twain.com", author.getEmail());
	}
	
	@Test
	void testGetGender() {
		assertEquals('m', author.getGender());
	}
}