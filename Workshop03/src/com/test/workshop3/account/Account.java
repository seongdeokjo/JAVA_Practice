package com.test.workshop3.account;

import com.test.workshop3.exception.*;

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

	public String toString() {
		return "[����]: " + account + " [�̸�] : " + name + " [�ݾ�] : " + balance + " �Դϴ�.";
	}
}
