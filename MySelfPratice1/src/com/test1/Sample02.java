package com.test1;

import java.util.Scanner;

public class Sample02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ù��° �� :");
		String strNum1 = scan.nextLine();
		System.out.println("�� ��° ��:");
		String strNum2 = scan.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1+num2;
		System.out.println("���� ��� : "+result);
		
		
	}

}
