package com.test1;

import java.util.Scanner;
class Exception1 extends Exception {
	Exception1(String msg) {
		super(msg);
	}
}
class Exception2 extends Exception {
	Exception2(String msg) {
		super(msg);
	}
}
public class Sample05 {

	public static void main(String[] args) throws Exception1, Exception2 {
		Scanner scan = new Scanner(System.in);
		int balance = 0;
		boolean run = false;
		while(!run) {
			int num = 0;
			int wd = 0;
			System.out.println("--------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4. ����");
			System.out.println("--------------------------------");
			System.out.print("���� >");
			num = scan.nextInt();
			try {
			switch(num) {
			case 1 :
				System.out.println("1.���� �ݾ��� �Է��ϼ���: ");
				balance = scan.nextInt();
				if(balance <=0) {
					throw new Exception1("�ּ� �ݾ��� 0�� �̻��Դϴ�.");
				}
				break;
			case 2:
				System.out.println("2. ��� �ݾ��� �Է��ϼ���.");
				wd = scan.nextInt();
				if(wd > balance) {
					throw new Exception2("��ݱݾ��� �ܾ׺��� Ů�ϴ�.");
				}
				balance -= wd;
				break;
			case 3:
				System.out.println("3. ���� ������ �ܾ��� "+balance+"�� �Դϴ�.");
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				run = true;
				break;		
			}				
		}catch(Exception1 e) {
			System.out.println("�ּұݾ��� 0�� �̻��Դϴ�.");
		}catch(Exception2 e) {
			System.out.println("��� �ݾ��� �ܰ��� ���ƿ�.");
		}
			
	}
}
}