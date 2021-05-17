package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AccountManager {
	final int MAX = 10;
	AccountInfo[] acc = new AccountInfo[MAX];
	int num;
	String name;
	String account;
	int balance;
	boolean isTrue = false;
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
			acc[num] = new AccountInfo(name,account,balance);
			num++;
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
		public  void showData() throws AccountNotFoundException {
			for(int i =0; i<num; i++) {
				acc[i].showInfo();
			
			}
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
