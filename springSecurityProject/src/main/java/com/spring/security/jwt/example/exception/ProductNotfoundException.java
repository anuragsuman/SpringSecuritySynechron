package com.spring.security.jwt.example.exception;

public class ProductNotfoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public ProductNotfoundException() {
		super();
	}

	public ProductNotfoundException(final String message) {
		super(message);
	}

}
