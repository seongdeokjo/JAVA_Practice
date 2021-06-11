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
				System.out.println("#####메뉴#####");
				System.out.println("1.사칙연산");
				System.out.println("2.종료");
				System.out.println("#############");	
				System.out.println("# 항목을 선택해주세요.");
				int select = Scanner1.getUserInput();
		switch(select) {
		case 1 : 
				System.out.println("연산자를 선택하시오.(+,-,*,/) :");
				Scanner1.getUserInput1();
				System.out.println("첫 번째 숫자를 입력해주세요:");
				int a1  = Scanner1.getUserInput();
				System.out.println("두번째 숫자를 입력해주세요:");
				int a2 = Scanner1.getUserInput();
				System.out.println("결꽈는 :"+Cal.cal(a1, a2));
//				int a3 = Cal.cal(a1, a2);
//				System.out.printf("결과는 : %d + %d = %d",a1,a2,a3);
				break;
		case 2 :
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
				}
				System.out.println(" ");
			}
	}
}