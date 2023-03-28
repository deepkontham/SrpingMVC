package com.ciq.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalException {
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	
	@ExceptionHandler(value = Exception.class)
	public String Exceptions() {
		return "NullpointerException";
		
	}

}
