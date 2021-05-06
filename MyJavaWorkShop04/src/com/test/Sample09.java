package com.test;

import java.util.Scanner;

public class Sample09 {

	public static void main(String[] args) {
//		int a = 10;
//		while(a == 10) {}
		for(;;) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("---------메뉴---------");
		System.out.println("--1.메뉴--");
		System.out.println("--2.종료--");
		System.out.println("---------------------");
		System.out.print("메뉴를 선택해주세요:");
		String inputString = scanner.nextLine();
		int num = Integer.parseInt(inputString);
		if(num == 1) {
				System.out.println("메뉴 입니다.");
		}else if( num == 2) {
				System.out.println("종료 입니다.");
				break;
		}	else {
			System.out.println("예외상황입니다.");
			break;
			}
		 
		}
	}
}
