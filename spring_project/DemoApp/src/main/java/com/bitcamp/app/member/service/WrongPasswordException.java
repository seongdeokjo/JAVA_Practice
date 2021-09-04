package com.bitcamp.app.member.service;

public class WrongPasswordException extends Exception {
	public WrongPasswordException(String msg) {
		super(msg);
	}
}
