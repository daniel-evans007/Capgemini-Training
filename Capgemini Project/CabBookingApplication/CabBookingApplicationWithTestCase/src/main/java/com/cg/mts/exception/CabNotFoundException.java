package com.cg.mts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CabNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
//	private static final long serialVersionUID = -9090587718141879101L;

	public CabNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
