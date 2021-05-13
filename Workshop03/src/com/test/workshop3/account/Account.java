package com.test.workshop3.account;

import com.test.workshop3.exception.InvalidValueException;

public class Account {

	private String account;
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	private String name;
	private int balance;

	public Account(String account, String name, int balance) throws InvalidValueException {
		// TODO 최초 입금 금액이 0원 이하인 경우, 예외 발생
		try {
			if (balance <= 0) {
				System.out.println("잔액이 모자랍니다..");
				throw new InvalidValueException("최초금액을 0원이상으로 입력해주세요.");
			} else 
				this.account = account;
				this.name = name;
				this.balance = balance;

		} catch (InvalidValueException e) {
			e.getMessage();
			e.getStackTrace();
		}

	}

	public void deposit(int money) throws InvalidValueException {
		// TODO 입금할 금액이 잘못 입력된 경우, 예외 발생
		try {
			if(money <= 0) {
				System.out.println("입금한 금액이 존재하지 않습니다.");
				 throw new InvalidValueException("다시 입력하세요");
			}
			this.balance += money;
		}catch(InvalidValueException e1) {
			e1.getMessage();
		}
		
	}

	public void withdraw(int money) throws InvalidValueException {
		// TODO 출금할 금액이 잘못 입력되었거나, 잔액이 부족한 경우 예외 발생
	try {
		if (balance < money) {
			throw new InvalidValueException("잔고 부족" + (money - balance) + "모자람");
		}
		balance -= money;
	}catch(InvalidValueException e) {
		e.getMessage();
	}
}
	@Override
	public String toString() {
		return "[계좌] " + this.account + "\t[예금주] " + this.name + "\t[잔액] " + this.balance;
	}
}