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
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
			System.out.println("--------------------------------");
			System.out.print("선택 >");
			num = scan.nextInt();
			try {
			switch(num) {
			case 1 :
				System.out.println("1.예금 금액을 입력하세요: ");
				balance = scan.nextInt();
				if(balance <=0) {
					throw new Exception1("최소 금액은 0원 이상입니다.");
				}
				break;
			case 2:
				System.out.println("2. 출금 금액을 입력하세요.");
				wd = scan.nextInt();
				if(wd > balance) {
					throw new Exception2("출금금액이 잔액보다 큽니다.");
				}
				balance -= wd;
				break;
			case 3:
				System.out.println("3. 현재 고객님의 잔액은 "+balance+"원 입니다.");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				run = true;
				break;		
			}				
		}catch(Exception1 e) {
			System.out.println("최소금액은 0원 이상입니다.");
		}catch(Exception2 e) {
			System.out.println("출금 금액이 잔고보다 많아요.");
		}
			
	}
}
}