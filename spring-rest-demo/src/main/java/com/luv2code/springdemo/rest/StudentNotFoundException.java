package com.luv2code.springdemo.rest;

public class StudentNotFoundException extends RuntimeException{

	public StudentNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public StudentNotFoundException(String message) {
		super(message);
	}

	public StudentNotFoundException(Throwable cause) {
		super(cause);
	}

}
