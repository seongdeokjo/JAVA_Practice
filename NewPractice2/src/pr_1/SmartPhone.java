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
		System.out.println("연락처 저장이 완료되었습니다.");
		System.out.println(" ");
	}

	// Contact 배열에 저장된 데이터의 리스트를 출력
	public void showList() {
//		System.out.println(list.size());
		if (list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println("["+i+"] 번째 연락처");
				System.out.println(list.get(i));
				System.out.println(" ");
			}
		} else {
			System.out.println("저장된 정보가 없습니다.");
		}
	}
	//연락처에 저장된 데이터를 찾아주는 메서드 
	public void findList() {
		int find = Integer.parseInt(getUserInput());
		
		
	}
	// Contact 배열에 저장된 요소 수정 하는 메서드 
	public void changeList() {
		
	}

	// Contact 배열에 저장된 리스트 삭제
	// 검색 조건에 이름 + 다른 변수 조건 넣어서 피해 최소화 시키기 
	public void deleteList() {
		System.out.println("연락처 삭제를 시작합니다.");
		System.out.println("삭제할 이름을 입력하세요.");
		String name = getUserInput();
		boolean isTrue = false;	
		// index가 0부터 시작이기 때문에 -1을 하지 않으면 IndexOutOfBoundsException 예외가 발생한다.
			for (int i = list.size()-1; i >= 0; i--) {				
				if (list.get(i).getName().equals(name)) {
					list.remove(i);				
					isTrue = true;
				}
				System.out.println(name+" 이/가 삭제되었습니다.");
			}			
		if (isTrue == false) {
			System.out.println("입력된 데이터가 없습니다.");
			}	
	}
	
	public static String getUserInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		return input;
	}
}