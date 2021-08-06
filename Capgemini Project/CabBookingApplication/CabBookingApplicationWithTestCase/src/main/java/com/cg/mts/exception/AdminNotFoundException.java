package com.cg.mts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class AdminNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
//	private static final long serialVersionUID = -5595964428948080655L;

	public AdminNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
