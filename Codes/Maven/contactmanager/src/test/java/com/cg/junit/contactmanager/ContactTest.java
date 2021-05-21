package com.cg.junit.contactmanager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactTest {

	public static Contact ct;
	
	@BeforeAll
	public static void setUp() {
		System.out.println("this method is annoted with @BeforeAll"
				+ " to execute as first method in the test class ContactTest");
	ct = new Contact("Rama","Krishna","0987654234");
	}
	
	@BeforeEach
	public void setUpForTest() {
		System.out.println("this method is annoted with @BeforeEach"
				+ "to execute before each test case");
	}
	
	//we are testing constructor
	@Test
	public void testContact() {
		Contact ct = new Contact("Rama","Krishna","0987654234");
		assertNotNull(ct);
		Contact ctOne = null;
		assertNull(ctOne);
	}
	
	@Test
	public void testGetters() {
		assertEquals("Rama", ct.getFirstName());
		assertEquals("Krishna", ct.getLastName());
		assertEquals("0987654234", ct.getMobileNo());
		assertNotEquals("987642346o", ct.getMobileNo());
	}
	
	@Test
	public void testValidateFirstName() {
		//ct = new Contact("Rama","Krishna","0987654234");
		assertSame("First Name is valid", ct.validateFirstName(ct.getFirstName()));
		assertNotSame(null, ct.validateFirstName(ct.getFirstName()));
	}

	@Test
	public void testValidateLastName() {
		//ct = new Contact("Rama","Krishna","0987654234");
		assertSame("Last Name is valid", ct.validateLastName(ct.getLastName()));
		assertNotSame(null, ct.validateLastName(ct.getLastName()));
	}
	
	@Test
	public void testValidateMobileNo() {
		//ct = new Contact("Rama","Krishna","0987654234");
		assertNotSame("mobileNo cannot be less than 10 digits", ct.validateMobileNo(ct.getMobileNo()));
		assertNotSame(null, ct.validateMobileNo(ct.getMobileNo()));
		assertNotSame("mobileNo can contain only digits", ct.validateMobileNo(ct.getMobileNo()));
		assertNotSame("mobileNo should start with 0", ct.validateMobileNo(ct.getMobileNo()));
		assertSame("Mobile number is valid",  ct.validateMobileNo(ct.getMobileNo()));
		assertSame("mobileNo can contain only digits",  ct.validateMobileNo("s123456780"));
		assertSame("mobileNo should start with 0",  ct.validateMobileNo("9075468967"));
	}
	
	@Test
	public void testDisplayDetails() {
		assertEquals(new String("The details of the contact is = Rama Krishna 0987654234"),ct.displayDetails());
		assertNotEquals(new String("The details of the contact is = Shiva Rama 0987654234"), ct.displayDetails());
	}
	
	@AfterEach
	public void stopThis() {
		System.out.println("this method is annoted with @AfterEach"
				+ "to execute after each test case");
	}
	
	@AfterAll
	public static void stopAll() {
		System.out.println("this method is annoted with @AfterAll"
				+ " to execute as last method in the test class ContactTest");
		ct = null;//now after assigning ct object to null it is eligible for removing from the memory
	}
}