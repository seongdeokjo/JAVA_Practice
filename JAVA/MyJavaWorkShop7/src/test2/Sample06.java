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
		System.out.println("����");
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
		System.out.println("1.���� 2.�ѱ� 3.���� �� �����ϼ���.");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		if(input.equals("1")) {
			System.out.println("�ѱ���� �λ�");
			Super s = new Kor();
			s.insa();
		}else if(input.equals("2")) {
			System.out.println("����� �λ�");
			Super e = new Eng();
		}else if(input.equals("3")) {
			System.out.println("�����մϴ�.");
			break;
		}else
		System.out.println("�ٽ� �λ�");

		}
	}
	

}
