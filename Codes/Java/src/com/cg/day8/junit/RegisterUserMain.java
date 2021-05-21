package com.cg.day8.junit;

public class RegisterUserMain {

	public static void main(String[] args) {
		
		RegisterUser user = new RegisterUser();
		
		user.readDetails();
		
		System.out.println(user.displayDetails());
	}
}