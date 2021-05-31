package com.test_12;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// 사용자에게 이름을 입력받아 입력 받은 문자열을 정상적인 문자열의 이름으로 표현하는지
		//판별하고, 공백으로 입력되었는지도 판별하는 프로그램을 만들어 보자.
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = scan.nextLine();
		scan.
		if(name != "" && name != null)  {
			System.out.println(name);
		}else {
			System.out.println("공백x");
		}
	}
}
