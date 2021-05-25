package com.test01;
import java.util.Scanner;
public class CalcTest {
	public static void main(String[] args) {
		//인스턴스생성 => 클래스의 정의가 필요(필요한 변수,필요한 메소드)
//	       클래스이름     참조변수 = new  클래스이름 
		Calculator calc = new Calculator(); // 메모리에 메소드 코드,저장. 주소가 저장 
		System.out.println("add= "+calc.add(20, 30)); 
		System.out.println("sub= "+calc.sub(2021, 65));
		System.out.println("multi= "+calc.multi(2, 7));
		System.out.println("divide= "+calc.divide(1996, 2));
		Scanner scan = new Scanner(System.in);
		System.out.print("반지름을 입력하세요. >");
		String input = scan.nextLine();
		double r = Double.parseDouble(input);
		System.out.println("원의 둘레는: "+calc.circleRadius(r)+" 입니다.");
		System.out.println("원의 넓이는 : "+calc.circleArea(r)+" 입니다.");
	}
}
