package com.cg.mts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class DriverNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 914569459626622748L;

	public DriverNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
