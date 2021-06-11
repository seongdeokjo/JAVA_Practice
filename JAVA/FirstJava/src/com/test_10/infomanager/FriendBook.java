package com.test_10.infomanager;

import java.util.Scanner;

public class FriendBook {

	public static void main(String[] args) {
		FriendInfoHandler handler = new FriendInfoHandler(100);

		while (true) {
			printInfo();
			Scanner scan = new Scanner(System.in);		
			int choice = Integer.parseInt(scan.nextLine());

			switch (choice) {
			case 1 : case 2 : case 3 :
				handler.addFriend(choice);
				break;
			case 4 :
				handler.showAllData();
				break;
			case 5 :
				handler.showAllBasicData();
				break;
			case 6 :
				handler.deletData();
				break;
			case 7 : 
				System.out.println("프로그램을 종료합니다.");
				return;				
			}
		}
	}
	public static void printInfo() {
		System.out.println("**메뉴 선택***********************");
		System.out.println("1. 고교 친구 정보 입력");
		System.out.println("2. 대학 친구 정보 입력");
		System.out.println("3. 가족 정보 입력");
		System.out.println("4. 전체 정보 출력");
		System.out.println("5. 기본 정보 출력");
		System.out.println("6. 친구 및 가족의 정보 삭제");
		System.out.println("7. 프로그램 종료");
		System.out.println("*******************************");
		System.out.println("선택>>");
	}
}
