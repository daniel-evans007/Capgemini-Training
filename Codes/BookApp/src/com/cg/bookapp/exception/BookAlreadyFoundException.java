package com.cg.bookapp.exception;

public class BookAlreadyFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5533746042457120542L;

	public BookAlreadyFoundException(String s) {
		super(s);
	}
}