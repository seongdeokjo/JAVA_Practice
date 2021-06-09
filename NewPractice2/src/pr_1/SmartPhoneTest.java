package pr_1;

import java.util.Scanner;

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone(10);
		
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		while(cnt != 4) {
			System.out.println("원하시는 메뉴를 선택하세요.");
			 cnt = scan.nextInt();
			switch(cnt) {
			case 1 :
				sp.addContact();
				break;
			case 2 : 
				sp.showList();
				break;
			case 3 : 
				sp.deleteList();
				break;
			case 4 :
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			}
			
				
			
			
		}
		
		
	
	}

}
