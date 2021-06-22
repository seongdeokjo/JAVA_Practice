package main;

import java.util.Scanner;

public class Main {
	//처음 출력 화면에서 프로그램이 시작 창
	public void menu() {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println("프로그램을 시작합니다.");
		System.out.println("1. 회원 로그인 2.비회원 회원가입 3.관리자 로그인 ");
		num = Integer.parseInt(scan.nextLine());
		switch(num) {
		case 1 :
			memberLogin();
			
			break;
		case 2 : 
			joinMember();
			break;
		case 3 :
			managerLogin();
			break;
		}
	
	}
	public void joinMember() {
		System.out.println("비회원 회원가입");
	}
	public void memberLogin() {
		System.out.println("멤버 로그인");
	}
	public void managerLogin() {
		System.out.println("매니저 로그인");
	}
	
	public static void main(String[] args) {
		// 회원가입 (비회원)
		// 로그인 ( 관리자, 회원)
		// 객체 car,member,manager => Dao 인스턴스 생성 
		
		
		//
		
		
	}

}
