package Workshop;
import java.util.*;
public class WorkShop2 {
	public static double getUserInput() {
		Scanner scanner = new Scanner(System.in);
		Double inputString = scanner.nextDouble();
		return inputString;
	}
	public static void main(String[] args) {

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
	System.out.println("평점은"+avg+"점 입니다.");
	// 각 과목별 성적이 2.5이상(한 과목이라도 2.5 미만시 ,과락으로 장학금 탈락
	//좀더 간결한 코드가 없을런지...?
	// 삼항 연산자 조건....?
	// 조건1) 평균이 3.7 이상 2)각 과목별 성적이 2.5이상 (2.5미만이라면 장학금 탈락)
	if(avg <3.7) {
		System.out.println("평균이 안됩니다.");
	}else if(a<2.5 || a1<2.5 || a2<2.5 || a3<2.5 || a4<2.5) {
		System.out.println("과락이야 친구야.");
	}
	else {
		System.out.println("다음 학기 장학금 대상자 입니다.");
	}
	
	
	double b,b1,b2,b3,b4;
	System.out.println("Computer Science 성적을 입력하세요 :");
		b = getUserInput();
	System.out.println("JavaPrograming 성적을 입력하세요 :");
		b1 = getUserInput();
	System.out.println("공학수학 성적을 입력하세요 :");
		b2 = getUserInput();
	System.out.println("오페라의 이해  성적을 입력하세요: ");
		b3 = getUserInput();
	System.out.println("배드민턴 성적을 성적을 입력하세요 :");
		b4 = getUserInput();
	System.out.println("==========================");
	double avg1 = (b+b1+b2+b3+b4) /5;
	System.out.println("평점은"+avg1+"점 입니다.");
	if(avg <3.7) {
		System.out.println("평균이 안됩니다.");
	}else if(b<2.5 || b1<2.5 || b2<2.5 || b3<2.5 || b4<2.5) {
		System.out.println("과락이야 친구야.");
	}
	else {
		System.out.println("다음 학기 장학금 대상자 입니다.");
	}
	
	}

}
