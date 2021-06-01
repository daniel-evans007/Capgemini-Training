package com.cg.cmapp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class ContactManagerTest {

	/**
	 * Object of Contact Manager Class
	 */
	private ContactManager contManager;
	
	@BeforeAll
	public static void setupAll() {
		System.out.println("Should print before all tests");
	}
	
	@BeforeEach
	public void setup() {
		System.out.println("Should print before each test");
		System.out.println("Instantiating Contact Manager");
		contManager = new ContactManager();
	}
	
	@Test
	@DisplayName("Should create contact")
	public void shouldCreateContact() {
		contManager.addContact("Anirban", "Goswami", "09831021095");
		assertFalse(contManager.getAllContacts().isEmpty());
		assertEquals(1, contManager.getAllContacts().size());
	}
	
	@Test
	@DisplayName("Should not create contact when first name is null")
	public void shouldThrowRunTimeExceptionWhenFirstNameIsNull() {
		Assertions.assertThrows(RuntimeException.class, () -> {
			contManager.addContact(null, "Goswami", "09831021095");
		});
	}
	
	@Test
	@DisplayName("Should not create contact when first name is null")
	public void shouldThrowRunTimeExceptionWhenLastNameIsNull() {
		Assertions.assertThrows(RuntimeException.class, () -> {
			contManager.addContact("Anirban", null, "09831021095");
		});
	}
	
	@Test
	@DisplayName("Should not create contact when first name is null")
	public void shouldThrowRunTimeExceptionWhenPhoneNoIsNull() {
		Assertions.assertThrows(RuntimeException.class, () -> {
			contManager.addContact("Anirban", "Goswami", null);
		});
	}
	
	@Test
	@DisplayName("Should test for Phone Number starting with zero")
	public void shouldTestPhoneNumberFormat() {
		Assertions.assertThrows(RuntimeException.class, () -> {
			contManager.addContact("Anirban", "Goswami", "98310200950");
		});
	}
	
	@Test
	@DisplayName("Should create contact")
	@EnabledOnOs(value = OS.LINUX)//Enabled on GNU/Linux
	public void shouldCreateContactOnLinux() {
		contManager.addContact("Anirban", "Goswami", "09831021095");
		assertFalse(contManager.getAllContacts().isEmpty());
		assertEquals(1, contManager.getAllContacts().size());
	}
	
}