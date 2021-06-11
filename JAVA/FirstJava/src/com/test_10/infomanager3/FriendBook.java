package com.test_10.infomanager3;

import java.util.Scanner;

public class FriendBook {

	public static void main(String[] args) {
		// 추상클래스는 인스턴스를 생성할 수 없다.
//		Friend friend = new Friend("","","");
		FriendInfoHandler handler = new FriendInfoHandler(100);

		while (true) {
			printInfo();
			Scanner scan = new Scanner(System.in);		
			int choice = Integer.parseInt(scan.nextLine());

			switch (choice) {
			case Menu.HIGH_FRI : 
			case Menu.UNIV_FRI : 
			case Menu.FAMILY :
				handler.addFriend(choice);
				break;
			case Menu.SHOW_ALL :
				handler.showAllData();
				break;
			case Menu.SHOW_BASIC :
				handler.showAllBasicData();
				break;
			case Menu.DELET_DATA :
				handler.deletData();
				break;
			case Menu.EXIT : 
				System.out.println("프로그램을 종료합니다.");
				return;				
			}
		}
	}
	public static void printInfo() {
		System.out.println("**메뉴 선택***********************");
		System.out.println(Menu.HIGH_FRI+"고교 친구 정보 입력");
		System.out.println(Menu.UNIV_FRI+"대학 친구 정보 입력");
		System.out.println(Menu.FAMILY+"가족 정보 입력");
		System.out.println(Menu.SHOW_ALL+"전체 정보 출력");
		System.out.println(Menu.SHOW_BASIC+"기본 정보 출력");
		System.out.println(Menu.DELET_DATA+"친구 및 가족의 정보 삭제");
		System.out.println(Menu.EXIT+"프로그램 종료");
		System.out.println("*******************************");
		System.out.println("선택>>");
	}
}

interface Menu{
 int HIGH_FRI = 1; // 	public static final 생략 가능
 int UNIV_FRI = 2;
 int FAMILY = 3;
 int SHOW_ALL = 4;
 int SHOW_BASIC = 5;
 int DELET_DATA = 6;
 int EXIT = 7;
	
}
