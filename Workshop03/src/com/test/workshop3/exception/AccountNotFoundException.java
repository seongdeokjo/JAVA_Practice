package com.test.workshop3.exception;
//�θ� Ŭ������ Exception�� ��ӹ޾� ����ڰ� ����(customException)�� Ŭ������ ����� �� �ִ�.
public class AccountNotFoundException extends Exception {
	public AccountNotFoundException(String msg) {
        super(msg);
    }
}