package com.cg.cmapp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

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
	
	@Nested
	class RepeatedTests {
		
		@DisplayName("Should create contact")
		@RepeatedTest(value = 5, name = "Repeating Contact Creation test {currentRepetition} of {totalRepetition}")
		public void shouldCreateContactRepeatedly() {
			contManager.addContact("Anirban", "Goswami", "09831021095");
			assertFalse(contManager.getAllContacts().isEmpty());
			assertEquals(1, contManager.getAllContacts().size());
		}
	}
	
	@Nested
	class ParameterizedTests {
		@DisplayName("Phone No should match required format")
		@ParameterizedTest
		@ValueSource(strings = {"09831020095", "08240745505", "09433125012"})
		public void shouldTestPhoneNumberFormatUsingValueSource(String phoneNumber) {
			contManager.addContact("Anirban", "Goswami", phoneNumber);
			assertFalse(contManager.getAllContacts().isEmpty());
			assertEquals(1, contManager.getAllContacts().size());
		}
	}
	
	private static List<String> phoneNumberList() {
		return Arrays.asList("09831020095", "08240745505", "09433125012");
	}
	
	@DisplayName("Testing Phone Numbers using method source")
	@ParameterizedTest
	@MethodSource("phoneNumberList")
	public void testPhoneNumbersUsingMethodSource(String phoneNumber) {
		contManager.addContact("Anirban", "Goswami", phoneNumber);
		assertFalse(contManager.getAllContacts().isEmpty());
		assertEquals(1, contManager.getAllContacts().size());
	}
	
	@Test
	@DisplayName("Disable Test")
	public void disableTest() {
		throw new RuntimeException("This Test has been disabled, i.e. shouldn't get executed");
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("Should execute after each test");
	}
	
	@AfterAll
	public static void tearDownAll() {
		System.out.println("Should print after completion of all tests");
	}
}