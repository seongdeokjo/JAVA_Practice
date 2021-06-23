package main;

import java.util.Scanner;

import manager.*;

public class Main {
	//사용자,관리자 로그인 하여 
	MemberManage mm = new MemberManage(ManagerDao.getInstance());
	CarManage cm = new CarManage(ManagerDao.getInstance());
	// 
	
	//비회원 -> 회원가입을 하고 -> 다시 로그인 창 -> 로그인 -> 기능 사용
	
	//회원 -> 로그인 -> 로그인 불일치 -> 다시 로그인 창 -> 로그인 성공 -> 기능 사용 
	
	//기능 -> 1.대여 2. 반납 3. 조회
	
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
	//비회원 회원가입
	public void joinMember() {
		System.out.println("비회원 회원가입");
		
		mm.insertMember();
		
	}
	// 멤버 로그인
	public  void memberLogin() {
		System.out.println("멤버 로그인");
		System.out.println("회원의 아이디를 입력하세요.");
		String id = getUserInput();
		System.out.println("회원의 비밀번호를 입력하세요.");
		String pw = getUserInput();
		mm.login(id, pw);
		
		
	}
	//매니저 로그인
	public void managerLogin() {
		System.out.println("매니저 로그인");
	}
	
	
	
	public static void main(String[] args) {
		Main main = new Main();
	
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		
//			mm.deletMember();
			main.joinMember();
			main.memberLogin();
			
//			cm.carList();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 회원가입 (비회원)
		// 로그인 ( 관리자, 회원)
		// 객체 car,member,manager => Dao 인스턴스 생성 
		
		
		//
		
		
	}
	public  String getUserInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		return input;
	}

}
