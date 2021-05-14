package com.test.workshop3.account;
<<<<<<< HEAD
import com.test.workshop3.exception.AccountNotFoundException;
import com.test.workshop3.exception.InvalidValueException;
public class Account {
	private String account;
	private String name;
	private int balance;
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
	public Account(String account, String name, int balance) throws InvalidValueException {
		// TODO ���� �Ա� �ݾ��� 0�� ������ ���, ���� �߻�
		if (balance <= 0) {
			throw new InvalidValueException("[����] ���ʱݾ��� 0�� �̻��Դϴ�.");
		}
		this.balance = balance;
		this.account = account;
		this.name = name;
		System.out.println("���°� ���������� �����Ǿ����ϴ�.");
	}
	public void deposit(int money) throws InvalidValueException {
		// TODO �Ա��� �ݾ��� �߸� �Էµ� ���, ���� �߻�
		if (money <= 0) {
			throw new InvalidValueException("�ּ� �ݾ��� 0�� �̻��Դϴ�.");
		}
		this.balance += money;
		System.out.println(money + " �� �����ԱݵǾ����ϴ�.");
	}
	public void withdraw(int money) throws InvalidValueException {
		// TODO ����� �ݾ��� �߸� �ԷµǾ��ų�, �ܾ��� ������ ��� ���� �߻�
		if (balance < money) {
			throw new InvalidValueException("�ܰ� ���� " + (money - balance) + " �����ڶ�");
		}
		if (money < 0) {
			throw new InvalidValueException("����� �ݾ��� 0�� �ʰ��� �Է���");
		}
		balance -= money;
	}
=======

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
		// TODO ���� �Ա� �ݾ��� 0�� ������ ���, ���� �߻�
		try {
			if (balance <= 0) {
				System.out.println("�ܾ��� ���ڶ��ϴ�..");
				throw new InvalidValueException("���ʱݾ��� 0���̻����� �Է����ּ���.");
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
		// TODO �Ա��� �ݾ��� �߸� �Էµ� ���, ���� �߻�
		try {
			if(money <= 0) {
				System.out.println("�Ա��� �ݾ��� �������� �ʽ��ϴ�.");
				 throw new InvalidValueException("�ٽ� �Է��ϼ���");
			}
			this.balance += money;
		}catch(InvalidValueException e1) {
			e1.getMessage();
		}
		
	}

	public void withdraw(int money) throws InvalidValueException {
		// TODO ����� �ݾ��� �߸� �ԷµǾ��ų�, �ܾ��� ������ ��� ���� �߻�
	try {
		if (balance < money) {
			throw new InvalidValueException("�ܰ� ����" + (money - balance) + "���ڶ�");
		}
		balance -= money;
	}catch(InvalidValueException e) {
		e.getMessage();
	}
}
>>>>>>> e63fdffb62c4da06ea739f21cc74794b436ab200
	@Override
	public String toString() {
		return "[����] " + this.account + "\t[������] " + this.name + "\t[�ܾ�] " + this.balance;
	}
}