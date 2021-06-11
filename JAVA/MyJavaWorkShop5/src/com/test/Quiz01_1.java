package com.test;
import java.util.Scanner;

public class Quiz01_1 {
	public static void main(String[] args) {
		for(;;) {
			
			System.out.println("##################################");
			System.out.println("# 1.덧셈");
			System.out.println("# 2.뺄셈");
			System.out.println("# 3.곱셈");
			System.out.println("# 4.나눗셈");
			System.out.println("# 5.종료");
			System.out.println("##################################");
		
			System.out.println("#메뉴를 선택해주세요.:");
			int input = getUserInput();
		switch(input) {
			case 1:
				int a =	print();
					System.out.println("결과는"+a+"입니다.");
				break;
			case 2:
				int b =	print1();
					System.out.println("결과는"+b+"입니다.");
				break;	
			}
		}
	}
// 매서드 호출을 잘하자
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
		System.out.println("첫번째숫자를 입력해주세요.");
			int a = getUserInput();
		System.out.println("두번째숫자를 입력해주세요.");
			int a1 = getUserInput();
			int result = add(a, a1);
				return result;
		}
	public static int print1() {
		System.out.println("첫번째숫자를 입력해주세요.");
			int a = getUserInput();
		System.out.println("두번째숫자를 입력해주세요.");
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
