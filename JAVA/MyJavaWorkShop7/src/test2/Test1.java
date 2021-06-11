package test2;


import java.util.Scanner;

public class Test1 {
	static int cal (int a,int b) {
		return a + b;
	}
public	static int getUserInput() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		return num;
	}
	
	public static void main(String[] args) {
		System.out.println("#####메뉴#####");
		System.out.println("1.사칙연산");
		System.out.println("2.종료");
		System.out.println("#############");
		
		System.out.println("# 항목을 선택해주세요.");
		int a =	getUserInput();
	for(;;) {
		switch(a) {
		case 1 : 
			System.out.println("연산자를 선택하시오.(+,-,*,/) : +"); 
			System.out.println("첫 번째 숫자를 입력해주세요:");
			int a1 = getUserInput();
			System.out.println("두번째 숫자를 입력해주세요:");
			int a2 = getUserInput();
			int a3 = cal(a1, a2);
			System.out.printf("결과는 : %d + %d = %d",a1,a2,a3);
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

