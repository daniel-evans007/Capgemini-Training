package com.cg.ordermanagementsystem.exception;

public class OrderNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1273052304976052425L;

	public OrderNotFoundException(String message) {
		super(message);
	}
}