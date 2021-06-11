package Workshop;
import java.util.*;
//각 과목별 성적이 2.5이상(한 과목이라도 2.5 미만시 ,과락으로 장학금 탈락
	//좀더 간결한 코드가 없을런지...?
	// 삼항 연산자 조건....?
	// 조건1) 평균이 3.7 이상 2)각 과목별 성적이 2.5이상 (2.5미만이라면 장학금 탈락)
// 성적을 계속 입력할수 있도록 만들기 
public class WorkShop2 {
	public static double getUserInput() {
		Scanner scanner = new Scanner(System.in);
		Double inputString = scanner.nextDouble();
		return inputString;
	}
	
	public static void main(String[] args) {
 for(;;) { //반복작업 할 수 있는 반복문 설정
	 Scanner scanner1 = new Scanner(System.in);
		System.out.println("########메뉴########");
		System.out.println("     1.성적입력     ");
		System.out.println("     2.프로그램 종료     ");
		System.out.println("###################");
		System.out.print("번호를 선택해주세요:"); // 성적입력과 종료를 선택하는 문장
		String inputString1 = scanner1.nextLine();
		int num = Integer.parseInt(inputString1);
	
	if(num == 1) {
		
		double a,a1,a2,a3,a4;
		System.out.println("Computer Science 성적을 입력하세요 :");
			a = getUserInput();
		System.out.println("JavaPrograming 성적을 입력하세요 :");
			a1 = getUserInput();
		System.out.println("공학수학 성적을 입력하세요 :");
			a2 = getUserInput();
		System.out.println("오페라의 이해  성적을 입력하세요: ");
			a3 = getUserInput();
		System.out.println("배드민턴 성적을 성적을 입력하세요 :");
			a4 = getUserInput();
		System.out.println("==========================");
		double avg = (a+a1+a2+a3+a4) /5;
		System.out.println("평균은"+avg+"점 입니다.");
		// 평점 3.7이상 , 각 과목별 2.5이상 장학금 혜택 조건문
		 if((a >= 2.5 && a1 >= 2.5 && a2 >= 2.5 && a3 >= 2.5 && a4 >= 2.5) && (avg >=3.7) ) {
			System.out.println("다음 학기 장학금 대상자 입니다.");
		}else {
			System.out.println();
			}
	
	}else if(num == 2) {
		System.out.println("프로그램이 종료됩니다.");
		break;
	}else {
		System.out.println("@@@@@다시 입력해주세요.@@@@@");
		continue;
			}
 	
 		}
	}

}

