package com.test01;
import java.util.Scanner;
public class CalcTest {
	public static void main(String[] args) {
		//인스턴스생성 => 클래스의 정의가 필요(필요한 변수,필요한 메소드)
//	       클래스이름     참조변수 = new  클래스이름 
		Calculator calc = new Calculator(); // 메모리에 메소드 코드,저장. 주소가 저장 
		Scanner scan = new Scanner(System.in);
		System.out.println("덧셈을 합니다.\n숫자1을 입력해주세요. ");
		int num1 = scan.nextInt();
		System.out.println("숫자2를 입력해주세요.");
		int num2 = scan.nextInt();
		System.out.println(num1+"+"+num2+"="+calc.add(num1, num2) );
			
		System.out.println("add= "+calc.add(20, 30)); 
		System.out.println("sub= "+calc.sub(2021, 65));
		System.out.println("multi= "+calc.multi(2, 7));
		System.out.println("divide= "+calc.divide(1996, 2));
		
		System.out.println("반지름을 입력하세요. >");
		double r = scan.nextDouble();
		//Math.round 를 사용해서 소수점 2자리까지만 출력
		System.out.println("원의 둘레는: "+Math.round(calc.circleRadius(r)*100) / 100.0+" 입니다.");
		System.out.println("원의 넓이는 : "+Math.round(calc.circleArea(r)*100) / 100.0+" 입니다.");
		
		
		
//		System.out.println(Math.round(calc.circleRadius(r)*100) / 100.0);
	}
}
