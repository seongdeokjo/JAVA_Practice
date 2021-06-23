package main;

import java.util.Scanner;

import manager.CarManage;
import manager.ManagerDao;
import manager.MemberManage;

public class UI {
	MemberManage mm = new MemberManage(ManagerDao.getInstance());
	CarManage cm = new CarManage(ManagerDao.getInstance());
	static boolean ck = false;
	
	public void checkLogin() {
		ck = !ck;
	}
	
	//전체 메뉴
	public void start() {
		System.out.println("프로그램을 시작합니다.");
		System.out.println("1.회원 2.비회원 3.관리자 4.종료  선택하세요.");
		while(true) {
		int num = 0;
		
		num = Integer.parseInt(getUserInput());
			switch(num) {
			case 1 :
				menuMember();
				break;
			case 2 :
				menuNoneMM();
				break;
			case 3 :
				break;
				
			case 4 :
				System.out.println("프로그램을 종료 합니다.");
				return;
			}
		}
	}
	//1번 회원 선택시
	// 멤버 로그인
	public void memberLogin() {
	
		System.out.println("멤버 로그인");
		System.out.println("회원의 아이디를 입력하세요.");
		String id = getUserInput();
		System.out.println("회원의 비밀번호를 입력하세요.");
		String pw = getUserInput();
		
		mm.login(id, pw);
		checkLogin();
	
	}
	//멤버 로그아웃
	public void logout() {
		checkLogin();
	}
	
	public void menuMember() {
	// 회원은 로그인을 먼저 진행해주세요.
		//1.로그인 2.대여 3.반납 4.차량 정보 5.로그아웃 
		int num = 0;
		System.out.println("회원 로그인을 진행해주세요.");
		while(true) {
			System.out.println("메뉴 선택을 해주세요.");
			System.out.println("1.로그인 2.대여 3.반납 4.차량 정보 5.로그아웃");
			num = Integer.parseInt(getUserInput());
			switch(num) {
			case 1:
				//로그인
			if(ck == false) {
				System.out.println("로그인을 합니다.");
				memberLogin();
				break;
			}else {
				System.out.println("이미 로그인 중입니다.");
				continue;
			}
			case 2 :
				//대여 메서드
				System.out.println("대여합니다.");
				break;
			case 3 : 
				//반납 메서드
				System.out.println("반납을 합니다.");
				break;
			case 4 : 
				//차량 정보 메서드
				System.out.println("차량 정보를 나타냅니다.");
				break;
			case 5 :
				System.out.println("로그아웃 합니다.");
				logout();
				start();
				
			}					
		}		
	}
	
	//2번 비회원 선택시
	public void menuNoneMM() {
		System.out.println("회원가입을 시작합니다.");
		mm.insertMember();
		System.out.println("회원가입이 완료되었습니다.");
		//다시 메인으로
		start();
	}
	
	//3번 관리자 선택시
	public void menuManager() {
		
	}
	
	public static String getUserInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		return input;
	}
}
