package pr_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SmartPhone {
	ArrayList<Contact> list;

	// 생성자로 배열의 개수 정하기
	public SmartPhone(int num) {
		list = new ArrayList<Contact>(num);

	}

	// 연락처를 저장하는 메서드
	public void addContact() {
		System.out.println("연락처 저장을 시작합니다.");
		System.out.println("이름을 입력하세요:");
		String name = getUserInput();
		System.out.println("전화번호를 입력하세요:");
		String ph = getUserInput();
		System.out.println("이메일을 입력하세요:");
		String email = getUserInput();
		System.out.println("주소를 입력하세요:");
		String address = getUserInput();
		System.out.println("생일을 입력하세요:");
		String birth = getUserInput();
		System.out.println("그룹을 입력하세요:");
		String group = getUserInput();
		addList(new Contact(name, ph, email, address, birth, group));
	}

	// 저장된 연락처를 리스트에 추가하는 메서드
	public void addList(Contact c) {
		list.add(c);
		System.out.println("정보가 저장되었습니다.");
	}

	// Contact 배열에 저장된 데이터의 리스트를 출력
	public void showList() {
		if (list.size() > 0) {
			for (Contact a : list) {
				a.showData();
				System.out.println(" ");
			}
		} else {
			System.out.println("저장된 정보가 없습니다.");
		}
	}

	// Contact 배열에 저장된 리스트 삭제
	public void deleteList() {
		System.out.println("삭제할 이름을 입력하세요.");
		String name = getUserInput();
		boolean isTrue = false;
		 Iterator itr = list.iterator();
		
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().equals(name)) {
					list.remove(i);
					System.out.println("삭제되었습니다.");
					continue;
				} else {
					isTrue = true;
					System.out.println("일치하는 이름이 없습니다.");
					return;
				}
			}
		}
//		
//		if (isTrue == false) {
//			System.out.println("입력된 데이터가 없습니다.");
//		}
	

	public static String getUserInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		return input;
	}

}
