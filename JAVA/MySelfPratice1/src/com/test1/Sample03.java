package com.test1;

import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ʼ� ���� �Է�");
		System.out.print("1.�̸� :");
		String name = scan.nextLine();
		System.out.print("2.�ֹι�ȣ �� 6�ڸ�: ");
		String ssn = scan.nextLine();
		System.out.print("3. ��ȭ��ȣ");
		String ph = scan.nextLine();
		System.out.println();
		
		System.out.println("[�Էµ� ����]");
		System.out.println("1. �̸�:"+name);
		System.out.println("2. �ֹι�ȣ6�ڸ� :"+ssn);
		System.out.println("3. ��ȭ��ȣ :"+ph);
	}

}
