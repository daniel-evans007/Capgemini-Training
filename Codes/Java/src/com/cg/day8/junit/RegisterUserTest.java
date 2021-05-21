package com.cg.day8.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RegisterUserTest {
	
	public static RegisterUser ru;
	@BeforeAll
	public static void setUp() {
		System.out.println("This method is annoted with @BeforeAll to execute as "
							+"first method in the test class RegisterUserTest");
		ru=new RegisterUser();
		ru.registerUser();
	}
	
	@BeforeEach
	public void setUpForTest() {
		System.out.println("This method is annoted with @BeforeEach to execute "
							+"before each test case");
	}

	@Test
	void testValidateFirstName() {
		assertSame("First Name is valid", ru.validateFirstName(ru.getFirstName()));
	}

	@Test
	void testValidateLastName() {
		assertSame("Last Name is valid", ru.validateLastName(ru.getLastName()));
	}

	@Test
	void testValidateMobileNo() {
		assertSame("Mobile number is valid",  ru.validateMobileNo(ru.getMobileNo()));
	}

	@Test
	void testValidateUserame() {
		assertSame("User Name is valid", ru.validateUserName(ru.getUserName()));
	}

	@Test
	void testValidatePassword() {
		assertSame("Password is valid", ru.validatePassword(ru.getPassword()));
	}


	@AfterEach
	public void stopEach(){
		System.out.println("This method is annoted with @BeforeEach to execute "
							+"before each test case");
	}
	
	@AfterAll
	public static void stopAll(){
		System.out.println("This method is annoted with @BeforeAll to execute as "
							+"last method in the test class RegisterUserTest");
		ru = null;
	}
}