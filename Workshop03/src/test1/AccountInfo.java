package test1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import test1.*;
public class AccountInfo {
	private String name;
	private String account;
	private int balance;
	AccountInfo(String name, String account, int balance) {
		this.name = name;
		this.account = account;
		this.balance = balance;
	}
	public void create() throws InvalidValueException {
		System.out.print(" ���¹�ȣ : ");
		account = getUserInput();
		System.out.print("������ : ");
		name = getUserInput();
		System.out.print("�����Ա� :");
		balance = Integer.parseInt(getUserInput());
		if (balance <= 0) {
			throw new InvalidValueException("[����] ���ʱݾ��� 0�� �̻��Դϴ�.");
		}
		new AccountInfo(account, name, balance);
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
	}
	public void deposit() throws InvalidValueException {
		System.out.print("�Ա��� �ݾ��� �Է��ϼ���.");
		int money = Integer.parseInt(getUserInput());
		if (money <= 0) {
			throw new InvalidValueException("�ּ� �ݾ��� 0�� �̻��Դϴ�.");
		}
		this.balance += money;
		System.out.println(money + " �� �����ԱݵǾ����ϴ�.");
	}
	public void withdraw() throws InvalidValueException {
		// TODO ����� �ݾ��� �߸� �ԷµǾ��ų�, �ܾ��� ������ ��� ���� �߻�
		System.out.print("����� �ݾ��� �Է��ϼ���.");
		int money = Integer.parseInt(getUserInput());
		if (balance < money) {
			throw new InvalidValueException("[����]!! �ܰ� ���� :" + (money - balance) + " �����ڶ�");
		}
		if (money < 0) {
			throw new InvalidValueException("[����]!! ����� �ݾ��� 0�� �ʰ��� �Է���");
		}
		this.balance -= money;
		System.out.println(money + "�� ���� ��ݵǾ����ϴ�.");
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
	public void showInfo() throws AccountNotFoundException {
		if (account == null && name == null && balance == 0) {
			throw new AccountNotFoundException("[����] ���°� �����ϴ�.");
		}
		System.out.println("[account]: " + account + ", [name]: " + name + ", [balance] :" + balance);
	}
}