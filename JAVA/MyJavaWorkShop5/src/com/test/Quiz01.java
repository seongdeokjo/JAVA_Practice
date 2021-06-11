//  코드의 중복이 너무 많은데 함수로 간단화 할 수 없는지?.... 
package com.test;

import java.util.Scanner;
class Calculator2{
	// 덧셈, 뺄셈 ,곱셈 , 나눗셈 
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
		// 1. 덧셈
		// 2. 뺄셈
		// 3. 곱셈
		// 4. 나눗셈
		// 5. 종료
		//###################################
		// # 메뉴를 선택해주세요. :
		//
		// 1을 선택한겨우
		// 첫번째 숫자를 입력해주세요. : 5
		// 두번째 숫자를 입력해주세요. : 5
		// 결과는 10입니다.
		// 단, 종료를 누를때까지 계속 반복적으로 처리하도록 구현하시오.
		// 사칙연산은 메소드로 구현하시오. 
		Calculator2 calc1 = new Calculator2();
		for(;;) {
			
			System.out.println("##################################");
			System.out.println("# 1.덧셈");
			System.out.println("# 2.뺄셈");
			System.out.println("# 3.곱셈");
			System.out.println("# 4.나눗셈");
			System.out.println("# 5.종료");
			System.out.println("##################################");
			System.out.println("#메뉴를 선택해주세요.:");
		
//			if(input == 5) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
			int input = getUserInput();
		switch(input) {
			case 1:
				System.out.println("첫번째숫자를 입력해주세요.");
					int a = getUserInput();
				System.out.println("두번째숫자를 입력해주세요.");
					int a1 = getUserInput();
				
					int result = calc1.add(a, a1);
				System.out.println("결과는"+result+"입니다.");
					Thread.sleep(1000);
					break;
			case 2:
				System.out.println("첫번째숫자를 입력해주세요.");
				int b = getUserInput();
				System.out.println("두번째숫자를 입력해주세요.");
				int b1 = getUserInput();
				
				int result1 = calc1.subtract(b, b1);
				System.out.println("결과는"+result1+"입니다.");
					break;
			case 3 :
				System.out.println("첫번째숫자를 입력해주세요.");
				int c = getUserInput();
				System.out.println("두번째숫자를 입력해주세요.");
				int c1 = getUserInput();
				
				int result2 = calc1.multipl(c, c1);
				//int result2 = c * c1;
				System.out.println("결과는"+result2+"입니다.");
					break;
			case 4 :
				System.out.println("첫번째숫자를 입력해주세요.");
				int d = getUserInput();
				System.out.println("두번째숫자를 입력해주세요.");
				int d1 = getUserInput();
				
				double result3 = calc1.divide(d, d1); //키보드입력 값이 int 형만 가능하기때문에 결과는 double로 나와도
													  // 스캐너입력시 실수 값을 주게되면 에러발생 ㅜ
													 // java.util.InputMismatchException
			//	int result3 = d / d1;
				System.out.println("결과는"+result3+"입니다.");
					break;
			case 5:
				System.out.println("종료");
				System.exit(0);
			default :
				System.out.println("잘못된 입력입니다. 다시입력해주세요");
					continue;
				
			}
		}
	}
}
