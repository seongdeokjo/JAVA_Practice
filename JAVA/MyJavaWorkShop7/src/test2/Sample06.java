package test2;

import java.util.Scanner;


 class Super {
	Super() {
		
	}
public void insa() {
		
	}
}
 class Kor extends Super {
	public void insa () {
		System.out.println("하이");
	}
}
 class Eng extends Super{
	public void insa() {
		System.out.println("Hi");
	}
}

public class Sample06 {
	public static void main(String[] args) {
		
	for(;;) {	
		System.out.println("1.영어 2.한글 3.종료 언어를 선택하세요.");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		if(input.equals("1")) {
			System.out.println("한국어로 인사");
			Super s = new Kor();
			s.insa();
		}else if(input.equals("2")) {
			System.out.println("영어로 인사");
			Super e = new Eng();
		}else if(input.equals("3")) {
			System.out.println("종료합니다.");
			break;
		}else
		System.out.println("다시 인사");

		}
	}
	

}
