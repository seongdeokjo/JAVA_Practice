package com.test.workshop3.exception;

public class AccountNotFoundException extends Exception {
	public AccountNotFoundException(String msg) {
        super(msg);
    }
}