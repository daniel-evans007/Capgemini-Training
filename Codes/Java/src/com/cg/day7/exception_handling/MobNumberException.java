package com.cg.day7.exception_handling;

public class MobNumberException extends Exception {

	public MobNumberException (String number) {
		
	}
	
	@Override
	public String getMessage() {
		return "Invalid Mobile Number";
	}
}