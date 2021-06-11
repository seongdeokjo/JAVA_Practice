package com.test_15;

import java.util.*;
public class BirthTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("태어난 년도를 입력해주세요. >>");
		try {
			int number = scan.nextInt();
			System.out.println("입력하신 숫자는 :"+number);

		}catch(InputMismatchException e) {
			System.out.println("입력하신 데이터는 숫자가 아닙니다.");
//			e.printStackTrace();
		}
		System.out.println("프로그램을 종료");
	}

}
