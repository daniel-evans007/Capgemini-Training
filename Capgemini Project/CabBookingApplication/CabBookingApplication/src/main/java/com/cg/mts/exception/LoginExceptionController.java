package com.cg.mts.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;

@ControllerAdvice
public class LoginExceptionController {

	@ExceptionHandler(value = UserNotLoginException.class)
	public ResponseEntity<Object> UserNotLogin(UserNotLoginException exception){
		return ResponseEntity.ok("Sorry, user is not logged in.");
	}
}
