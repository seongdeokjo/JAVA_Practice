package com.test;
import java.util.Scanner;

public class Quiz01_1 {
	public static void main(String[] args) {
		for(;;) {
			
			System.out.println("##################################");
			System.out.println("# 1.����");
			System.out.println("# 2.����");
			System.out.println("# 3.����");
			System.out.println("# 4.������");
			System.out.println("# 5.����");
			System.out.println("##################################");
		
			System.out.println("#�޴��� �������ּ���.:");
			int input = getUserInput();
		switch(input) {
			case 1:
				int a =	print();
					System.out.println("�����"+a+"�Դϴ�.");
				break;
			case 2:
				int b =	print1();
					System.out.println("�����"+b+"�Դϴ�.");
				break;	
			}
		}
	}
// �ż��� ȣ���� ������
	static int add(int x, int y) {
		return x+y;
		}
	static int subtract(int x, int y) {
		return x-y; 	
		}
	static int multipl(int d, int e) {	
		return d * e;
		}
	static double divide(double d,double e) {
		return d / e;
		}
	
	public static int print() {
		System.out.println("ù��°���ڸ� �Է����ּ���.");
			int a = getUserInput();
		System.out.println("�ι�°���ڸ� �Է����ּ���.");
			int a1 = getUserInput();
			int result = add(a, a1);
				return result;
		}
	public static int print1() {
		System.out.println("ù��°���ڸ� �Է����ּ���.");
			int a = getUserInput();
		System.out.println("�ι�°���ڸ� �Է����ּ���.");
			int a1 = getUserInput();
			int result = subtract(a, a1);
				return result;
		}
	
	public static int getUserInput() {
		Scanner scanner = new Scanner(System.in);
		 String input3 = scanner.nextLine();
		 return Integer.parseInt(input3);
	}
}
