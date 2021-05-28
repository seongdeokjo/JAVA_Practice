package com.test_10.infomanager;

import java.util.Scanner;

public class FriendBook {

	public static void main(String[] args) {
		FriendInfoHandler handler = new FriendInfoHandler(100);

		while (true) {
			System.out.println("**메뉴 선택***********************");
			System.out.println("1. 고교 친구 정보 입력");
			System.out.println("2. 대학 친구 정보 입력");
			System.out.println("3. 전체 정보 출력");
			System.out.println("4. 기본 정보 출력");
			System.out.println("5. 친구 정보 삭제");
			System.out.println("6. 프로그램 종료");
			System.out.println("*******************************");
			System.out.println("선택>>");

			Scanner scan = new Scanner(System.in);
			
			int choice = Integer.parseInt(scan.nextLine());

			switch (choice) {
			case 1 : case 2 :
				handler.addFriend(choice);
				break;
			case 3 :
				handler.showAllData();
				break;
			case 4 :
				handler.showAllBasicData();
				break;
			case 5 :
				handler.deletData();
				break;
			case 6 : 
				System.out.println("프로그램을 종료합니다.");
				return;				
			}
		}
	}
}
