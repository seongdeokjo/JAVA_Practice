package com.test1;

import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("필수 정보 입력");
		System.out.print("1.이름 :");
		String name = scan.nextLine();
		System.out.print("2.주민번호 앞 6자리: ");
		String ssn = scan.nextLine();
		System.out.print("3. 전화번호");
		String ph = scan.nextLine();
		System.out.println();
		
		System.out.println("[입력된 내용]");
		System.out.println("1. 이름:"+name);
		System.out.println("2. 주민번호6자리 :"+ssn);
		System.out.println("3. 전화번호 :"+ph);
	}

}
