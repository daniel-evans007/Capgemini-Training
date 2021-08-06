package com.cg.mts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CustomerNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1970762601225780363L;

	public CustomerNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	

}
