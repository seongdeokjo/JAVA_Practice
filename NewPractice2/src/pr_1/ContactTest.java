package pr_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ContactTest {
	static Contact con;
	public static String getUserInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		return input;
	}
	public static Contact addInfo() {
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
	return	con = new Contact(name,ph,email,address,birth,group);	
	}
	
	public static void main(String[] args) {
		List<Contact> list = new ArrayList<>();
		Iterator itr = list.listIterator();
		int num = 0;
		
		while(num != 3) {
			System.out.println("번호를 선택하세요:");
			num = Integer.parseInt(getUserInput());
			
			switch(num) {
			case 1 :
				list.add(addInfo());
				break;
			case 2 :
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				break;
			case 3 :
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
				break;
			}

		}
		
		
	
		
		}
	}
