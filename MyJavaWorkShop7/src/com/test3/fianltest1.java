package com.test3;
import java.util.Scanner;
class Cal {	 
		static int cal (int a,int b) {
			return a + b;
		}
}
class Scanner1 {
	static Scanner scanner = new Scanner(System.in);  	
	static int getUserInput() {
    			 String input = scanner.nextLine();
    			 int num = Integer.parseInt(input);
				 return num;
		}
	static String getUserInput1() {
				String input1 = scanner.nextLine();
				return input1;
		}
}
public class fianltest1 {
	public static void main(String[] args) {
	for(;;) {
				System.out.println("#####�޴�#####");
				System.out.println("1.��Ģ����");
				System.out.println("2.����");
				System.out.println("#############");	
				System.out.println("# �׸��� �������ּ���.");
				int select = Scanner1.getUserInput();
		switch(select) {
		case 1 : 
				System.out.println("�����ڸ� �����Ͻÿ�.(+,-,*,/) :");
				Scanner1.getUserInput1();
				System.out.println("ù ��° ���ڸ� �Է����ּ���:");
				int a1  = Scanner1.getUserInput();
				System.out.println("�ι�° ���ڸ� �Է����ּ���:");
				int a2 = Scanner1.getUserInput();
				System.out.println("��ʴ� :"+Cal.cal(a1, a2));
//				int a3 = Cal.cal(a1, a2);
//				System.out.printf("����� : %d + %d = %d",a1,a2,a3);
				break;
		case 2 :
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				break;
				}
				System.out.println(" ");
			}
	}
}