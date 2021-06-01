package com.cg.bookapp.exception;

public class BookNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4587198687016244309L;

	public BookNotFoundException(String s) {
		super(s);
	}
}