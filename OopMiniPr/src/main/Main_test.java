package main;

import java.util.Scanner;

import manager.*;
public class Main_test {
	//사용자,관리자 로그인 하여 
	MemberManage mm = new MemberManage(ManagerDao.getInstance());
	CarManage cm = new CarManage(ManagerDao.getInstance());
	static boolean ck = false;

	// 
	
	//비회원 -> 회원가입을 하고 -> 다시 로그인 창 -> 로그인 -> 기능 사용
	
	//회원 -> 로그인 -> 로그인 불일치 -> 다시 로그인 창 -> 로그인 성공 -> 기능 사용 
	
	//기능 -> 1.대여 2. 반납 3. 조회
	
	//처음 출력 화면에서 프로그램이 시작 창
	
	//로그인 ,로그아웃 메서도
	public void checkLogin() {
		ck = !ck;
	}
/*	System.out.println("프로그램을 시작합니다.");
	System.out.println("1.회원 2.비회원 3.관리자  선택하세요.");
	// 1번 선택시
	System.out.println("1.로그인 2.회원 기능 3.차량 정보 조회 4.로그아웃 ");
	// 2번 선택시
	System.out.println("1.회원가입");
	System.out.println("다시 처음으로 돌아가서 회원 선택할 수 있게");
	// 3번 선택시
	System.out.println("1.관리자 로그인 2.회원 리스트 3. 회원 정보 삭제 4.차량 등록 5.차량 삭제 6.관리자 로그아웃");
	*/
	public void start() {
		System.out.println("프로그램을 시작합니다.");
		System.out.println("1.회원 2.비회원 3.관리자 4. 종료  선택하세요.");
		while(true) {
		int num = 0;
		
		num = Integer.parseInt(getUserInput());
			switch(num) {
			case 1 :
				
				break;
			case 2 :
				break;
			case 3 :
				break;
				
			case 4 :
				System.out.println("프로그램을 종료 합니다.");
				return;
		
			}
		
		}
	}
	
	public void menu() {
			
		Scanner scan = new Scanner(System.in);
	
		int num = 0;
		
		while(true) {
					
		System.out.println("1. 회원 로그인 2.비회원 회원가입 3.관리자 로그인 4.회원 기능 5.로그아웃 6.종료");
		num = Integer.parseInt(scan.nextLine());
		
		switch(num) {
			
		case 1 :
			if(ck == false) {
				System.out.println("로그인을 합니다.");
				memberLogin();
				break;
			}else {
				System.out.println("이미 로그인 중입니다.");
				continue;
			}
						
		case 2 : 
			joinMember();
			break;
			
		case 3 :
			managerLogin();
			break;
		case 4 :
			memberLogin();
			break;
		case 5 : 
			System.out.println("로그아웃을 합니다");
			logout();
			break;
		case 6 : 
			System.out.println("종료");
			return ;
			}
		}
	
	}
	//비회원 회원가입
	public void joinMember() {
		System.out.println("비회원 회원가입");
		mm.insertMember();
		
	}
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
	public void logout() {
		checkLogin();
	}
	

	//매니저 로그인
	public void managerLogin() {
		System.out.println("매니저 로그인");
	}
	
	
	
	public static void main(String[] args) {
		Main_test main = new Main_test();
		UI ui = new UI();
		
		
	
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			main.menu();
			ui.start();
//			mm.deletMember();
//			main.joinMember();
//			main.memberLogin();
			
//			cm.carList();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public static String getUserInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		return input;
	}

}
