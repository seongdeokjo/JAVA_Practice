//  �ڵ��� �ߺ��� �ʹ� ������ �Լ��� ����ȭ �� �� ������?.... 
package com.test;

import java.util.Scanner;
class Calculator2{
	// ����, ���� ,���� , ������ 
	static int add(int x, int y) {	
		return x+y;
	}
	static int subtract(int x, int y) {		 
			return x-y; 	
	}
	static int multipl(int d, int e) {		
			return d * e;
		}
	static double divide(double d, double e) {	
		return (double)d / e;
	}
}
public class Quiz01 {
	public static int getUserInput() {
		Scanner scanner = new Scanner(System.in);
		String input2 = scanner.nextLine();
		return Integer.parseInt(input2);
	}
	public static void main(String[] args) throws InterruptedException {
//		int a , a1, result;
		// #################################
		// 1. ����
		// 2. ����
		// 3. ����
		// 4. ������
		// 5. ����
		//###################################
		// # �޴��� �������ּ���. :
		//
		// 1�� �����Ѱܿ�
		// ù��° ���ڸ� �Է����ּ���. : 5
		// �ι�° ���ڸ� �Է����ּ���. : 5
		// ����� 10�Դϴ�.
		// ��, ���Ḧ ���������� ��� �ݺ������� ó���ϵ��� �����Ͻÿ�.
		// ��Ģ������ �޼ҵ�� �����Ͻÿ�. 
		Calculator2 calc1 = new Calculator2();
		for(;;) {
			
			System.out.println("##################################");
			System.out.println("# 1.����");
			System.out.println("# 2.����");
			System.out.println("# 3.����");
			System.out.println("# 4.������");
			System.out.println("# 5.����");
			System.out.println("##################################");
			System.out.println("#�޴��� �������ּ���.:");
		
//			if(input == 5) {
//				System.out.println("���α׷��� �����մϴ�.");
//				break;
//			}
			int input = getUserInput();
		switch(input) {
			case 1:
				System.out.println("ù��°���ڸ� �Է����ּ���.");
					int a = getUserInput();
				System.out.println("�ι�°���ڸ� �Է����ּ���.");
					int a1 = getUserInput();
				
					int result = calc1.add(a, a1);
				System.out.println("�����"+result+"�Դϴ�.");
					Thread.sleep(1000);
					break;
			case 2:
				System.out.println("ù��°���ڸ� �Է����ּ���.");
				int b = getUserInput();
				System.out.println("�ι�°���ڸ� �Է����ּ���.");
				int b1 = getUserInput();
				
				int result1 = calc1.subtract(b, b1);
				System.out.println("�����"+result1+"�Դϴ�.");
					break;
			case 3 :
				System.out.println("ù��°���ڸ� �Է����ּ���.");
				int c = getUserInput();
				System.out.println("�ι�°���ڸ� �Է����ּ���.");
				int c1 = getUserInput();
				
				int result2 = calc1.multipl(c, c1);
				//int result2 = c * c1;
				System.out.println("�����"+result2+"�Դϴ�.");
					break;
			case 4 :
				System.out.println("ù��°���ڸ� �Է����ּ���.");
				int d = getUserInput();
				System.out.println("�ι�°���ڸ� �Է����ּ���.");
				int d1 = getUserInput();
				
				double result3 = calc1.divide(d, d1); //Ű�����Է� ���� int ���� �����ϱ⶧���� ����� double�� ���͵�
													  // ��ĳ���Է½� �Ǽ� ���� �ְԵǸ� �����߻� ��
													 // java.util.InputMismatchException
			//	int result3 = d / d1;
				System.out.println("�����"+result3+"�Դϴ�.");
					break;
			case 5:
				System.out.println("����");
				System.exit(0);
			default :
				System.out.println("�߸��� �Է��Դϴ�. �ٽ��Է����ּ���");
					continue;
				
			}
		}
	}
}
