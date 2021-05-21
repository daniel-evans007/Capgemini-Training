package com.cg.day8.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RegisterUserTest {

	public static RegisterUser user;
	
	@BeforeAll
	public static void setUp() {
		System.out.println("This method is annoted with @BeforeAll to execute as "
				+"first method in the test class RegisterUserTest");
	}
	
	@Test
	void testValidateFirstName() {
		assertSame("First Name is valid", user.validateFirstName(user.getFirstName()));
	}

	@Test
	void testValidateLastName() {
		assertSame("Last Name is valid", user.validateLastName(user.getLastName()));
	}

	@Test
	void testValidateMobileNo() {
		assertSame("Mobile number is valid", user.validateMobileNo(user.getMobileNo()));
	}

	@Test
	void testValidateUserName() {
		assertSame("Username is valid", user.validateUserName(user.getUserName()));
	}

	@Test
	void testValidatePassword() {
		assertSame("Password is valid", user.validatePassword(user.getPassword()));
	}

	@AfterEach
	void stopEach() {
		System.out.println("This method is annoted with @BeforeEach to execute "
				+"before each test case");
	}

	@AfterAll
	public static void stopAll(){
		System.out.println("This method is annoted with @BeforeAll to execute as "
							+"last method in the test class RegisterUserTest");
		user = null;
	}
}