package com.test.workshop3.account;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.test.workshop3.exception.AccountNotFoundException;
import com.test.workshop3.exception.InvalidValueException;

public class AccountTest {
	public static void main(String[] args) throws InvalidValueException, AccountNotFoundException {
		int menu = 0;
		Account acc = null;
		while (menu != 9) {

			printMenu();
			try {
				String account;
				String name;
				int balance;
				menu = Integer.parseInt(getUserInput());
				int a3;
				int a4;
				// TODO �� �޴� ���� �� �ؾ� �� �� ����
				switch (menu) {

				case 1: // ���� ����
					System.out.print("\n���¹�ȣ : ");
					account = AccountTest.getUserInput();
					System.out.print("������ : ");
					name = AccountTest.getUserInput();
					System.out.print("���� �Ա� : ");
					balance = Integer.parseInt(getUserInput());
					acc = new Account(account, name, balance);
					break;
				case 2: // ���� ���� ���
					if (acc == null) {
						throw new AccountNotFoundException("[����] ���°� �����ϴ�.");
					}
					System.out.println("���� ������ ���� ���� ����Դϴ�.");
					System.out.println(acc);

					break;
				case 3: // �Ա�
					System.out.print("�Ա��� �ݾ� : ");
					a3 = Integer.parseInt(getUserInput());
					acc.deposit(a3);
					break;
				case 4: // ���
					System.out.print("����� �ݾ� : ");
					a4 = Integer.parseInt(getUserInput());
					acc.withdraw(a4);
					break;
				case 9: // ����
					System.out.println("�����մϴ�.");
					break;
				default:
					System.out.println("[����] �޴��� �߸� �Է��Ͽ����ϴ�.");
					break;
				}
			} catch (AccountNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (InvalidValueException e) {
				System.out.println(e.getMessage()); // TODO catch ����ȭ (������ ���� ��Ȳ ����)
			} catch (NumberFormatException e) {
				System.out.println("[����] �޴��� ���ڷ� �Է��ؾ� �մϴ�.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private static void printMenu() {
		System.out.println("\n===== < �޴� > =====");
		System.out.println(" 1. ���� ����");
		System.out.println(" 2. ���� ���� ���");
		System.out.println(" 3. �Ա�");
		System.out.println(" 4. ���");
		System.out.println(" 9. ����");
		System.out.println("===================");
		System.out.print(">> �޴� : ");
	}

	public static String getUserInput() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString = null;

		try {
			inputString = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return inputString;
	}
}