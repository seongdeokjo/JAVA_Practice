package com.test_10.infomanager3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class FriendInfoHandler {
	// 저장 데이터(객체)를 배열로 저장하고 관리하는 기능을 가지는 클래스
	// 2021 -05-31 배열 -> 컬렉션
	// Friend[] friends;
	// int numOfFriend; // 배열의 입력 index역활, 정보의 개수
	ArrayList<Friend> friends;
	Scanner scan = new Scanner(System.in);

	// 생성자
	public FriendInfoHandler(int num) {
		friends = new ArrayList<Friend>(num);
		// this.friends = new Friend[num];
		// numOfFriend = 0; // 안해줘도 되지만 명시적으로 표시해주기위해 사용
	}

	// 데이터의 입력 처리
	// 사용자로부터 친구의 정보를 입력받아서 -> 인스턴스를 생성 -> 배열에 저장한다.
	public void addFriend(int choice) { // choice -> 1.(고교) or 2.(대학)

		System.out.println("이름을 입력해주세요.>> ");
		String name = scan.nextLine();
		System.out.println("전화번호를 입력헤주세요 >> ");
		String phoneNumber = scan.nextLine();
		System.out.println("주소를 입력해주세요 >>");
		String address = scan.nextLine();
		// 이름이 중복되었을때 phoneNumber로 확인 .

		if (choice == 1) { // 고교 친구
			System.out.println("직업을 입력해주세요 >>");
			String work = scan.nextLine();
			// HighFriend hFriend = new HighFriend(name,phoneNumber, address, work);
			// addFriendInfo(hFriend); +v
			// 인스턴스 생성
			addFriendInfo(new HighFriend(name, phoneNumber, address, work));
			// 배열에 요소 추가
			// friends[numOfFriend++] = hFriend;
		} else if (choice == 2) { // 2.대학
			System.out.println("전공을 입력해주세요 >>");
			String major = scan.nextLine();
			// 인스턴스 생성
			// addFriendInfo(new UnivFriend(name, phoneNumber, address, major));
			System.out.println("email을 입력해주세요>>");
			String email = scan.nextLine();
			System.out.println("학년을 입력해주세요.");
			int year = Integer.parseInt(scan.nextLine());
			addFriendInfo(new PhoneUnivInfor(name, phoneNumber, address, major, email, year));

			// 배열에 요소 추가
			// friends[numOfFriend++] = univFriend;
		} else if (choice == 3) {
			System.out.println("가족관계를 입력해주세요.>>");
			String relation = scan.nextLine();
			addFriendInfo(new PhoneFamily(name, phoneNumber, address, relation));
		} else {

		}
	}

	// Friend 클래스를 상속하는 타입의 인스턴스를 받아 배열에 저장
	public void addFriendInfo(Friend f) {
		// 배열에 요소 추가
		// friends[numOfFriend++] = f;
		// List에 요소 추가
		friends.add(f);
		System.out.println("정보가 저장되었습니다.");
	}

	public void showAllBasicData() {
		System.out.println("친구의 모든 기본 정보를 출력합니다.");
		System.out.println("------------------------------");
		// 2021-05-31 수정 : List 출력 수정
		if (!friends.isEmpty()) {
			for (int i = 0; i < friends.size(); i++) {
				// friends[i].showBasicInfo();
				friends.get(i).showBasicInfo();
				System.out.println("------------------------------");
			}
		} else {
			System.out.println("입력된 정보가 없습니다.");
		}
		System.out.println("------------------------------");
	}

	// 모든 데이터를 출력하는 메소드
	public void showAllData() {
		System.out.println(" 모든 정보를 출력합니다.");
		System.out.println("------------------------------");
		// 2021-05-31 : 수정
		// 요소의 저장방식이 배열-> 컬렉션 => 반복문 수정
		if (friends.size() > 0) {
			for (int i = 0; i < friends.size(); i++) {
				// friends[i].showData();
				friends.get(i).showData();
				System.out.println("------------------------------");
			}
		} else {
			System.out.println("입력된 정보가 없습니다.");
		}
		System.out.println("------------------------------");
	}

	public void deletData() {
		System.out.println("삭제할 이름을 입력해주세요.");
		String name = scan.nextLine();
		boolean isTrue = false;
		Iterator itr = friends.iterator();

		// int point = 0;
		// for (int i = 0; i < numOfFriend; i++) {
		// if ((friends[i].name).equals(name)) {
		// isTrue = true;
		// point = i;
		// }
		// }
		// if (isTrue == true) {
		// // 삭제할 데이터부터 배열의 길이 끝까지 한칸씩 앞으로 밀면서 저장한다.
		// for (int i = point; i < numOfFriend; i++) {
		// friends[i] = friends[i + 1];
		// System.out.println("[" + name + "] 의 데이터가 삭제되었습니다.");
		// }
		// // 마지막 배열에 null값이 저장되기 때문에 배열의 길이를 한칸 없앤다.
		// numOfFriend--;
		// }else {
		// System.out.println("데이터에 저장된 이름이 없습니다.");
		// }
		// 2021-05-31 배열 -> 컬렉션
//		
		// 문제 : 같은 이름이 여러개일 경우 맨 처음의 값만 삭제되고 그 뒤에 값은 삭제 되지 않음 ....
			for (int i = 0; i < friends.size(); i++) {
				if (friends.get(i).name.equals(name)) {
					friends.remove(i);
					isTrue = true;
				}
			}
			if (isTrue == false) {
				System.out.println("입력된 데이터가 없습니다.");	
		}	
	}
}