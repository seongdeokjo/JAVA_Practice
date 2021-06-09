package pr_1;

import java.util.Scanner;

public class SmartPhoneTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("저장 크기를 입력해주세요.");
		int sizeC = scan.nextInt();
		SmartPhone sp = new SmartPhone(sizeC);
		
		int cnt = 0;
		// 2021.06.09 pm 11:23 삭제기능에서 이름이 중복된 사람들 모두 삭제 기능 추가
		//=============== 개선사항 ================
		//1. 근데 만약 이름이 중복됬다는 이유만으로 원치 않는 사람이 삭제된다면 ..? 선택적으로 삭제 할 수 있는 기능 생각 
		//2. 중복된 이름말고 그룹별 혹은 이름 && 생일/전화번호 등 조건을 추가해서 맞는 사람만 삭제할 수 있도록 
		//3. 검색 ,수정 기능 추가하기 
		//4. 나중에 확장성을 고려 코드 분리화 개선하기  
		while(cnt != 4) {
			System.out.println("원하시는 메뉴를 선택하세요.");
			 cnt = scan.nextInt();
			switch(cnt) {
			case 1 :
				sp.addContact();
				break;
			case 2 : 
				System.out.println("저장된 데이터의 리스트를 출력합니다.");
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