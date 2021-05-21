package com.cg.junit.contactmanager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactTest {

	static Contact contact;
	
	@BeforeAll
	public static void setUp() {
		System.out.print("This method is annotated with @BeforeAll, "
				+ "executed as the first method in the test class\n");
		contact = new Contact("Anirban", "Goswami", "8240745504");
	}
	
	@BeforeEach
	public void setUpForTest() {
		System.out.print("This method is annotated with @BeforeEach, "
				+ "executed before each test case\n");
		contact.readDetails();
	}
	
	@Test
	public void testContact() {
		Contact contact = new Contact("Anirban", "Goswami", "8240745504");
		assertNotNull(contact);
		
		Contact contactOne = null;
		assertNull(contactOne);
	}
	
	@Test
	public void testGetters() {
		assertEquals("Anirban",contact.getFirstName());
		assertEquals("Goswami",contact.getLastName());
		assertEquals("8240745504",contact.getMobileNo());
	}	
}