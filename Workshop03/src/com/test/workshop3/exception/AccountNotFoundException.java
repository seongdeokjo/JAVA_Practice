package com.test.workshop3.exception;
//부모 클래스인 Exception을 상속받아 사용자가 정의(customException)한 클래스를 사용할 수 있다.
public class AccountNotFoundException extends Exception {
	public AccountNotFoundException(String msg) {
        super(msg);
    }
}