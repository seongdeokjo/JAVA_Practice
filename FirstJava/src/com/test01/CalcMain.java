package com.test01;
interface Calculator {
	long add(long n1, long n2);
	long substract(long n1, long n2);
	long multiply(long n1, long n2);
	double divide(double n1, double n2);	
}

//1.Calculator 인터페이스를 상속하는 추상 클래스를 정의해봅시다.
abstract class CalcAbstract implements Calculator {
	// 추상 클래스는 '미완성 설계도'
	// 추상 메서드(미완성 메서드) : 선언부만 있고 구현부(몸통,바디)가 없는 메서드 
	//일반메서드가 추상메서드를 호출 할 수 있다.
	//완성된 설계도가 아니므로 인스턴스를 생성할 수 없다.
	//다른 클래스를 작성하는데 도움을 줄 목적으로 작성된다. 
	public abstract long add(long n1, long n2) ;
	public abstract  long substract(long n1, long n2);
	public abstract long multiply(long n1, long n2);
	public abstract double divide(double n1, double n2);	
}
//2. Claculator 인터페이스를 상속하는 인스턴스를 생성할 수 있는 클래스를 정의해봅시다.
 class Calculator1 implements Calculator {
	
	public long add(long n1, long n2) {
		return n1 + n2;
	}
	public long substract(long n1, long n2) {
		return n1 - n2;
	}
	public long multiply(long n1, long n2) {
		return n1 * n2;
	}
	public double divide(double n1, double n2) {
		return n1 / n2;
	}
 }
public class CalcMain {

	public static void main(String[] args) {
//		3.다형성의 특징으로 상위 타입인 인터페이스 타입의 참조변수에 인터페이스를
//		구현한 클래스 타입의 인스턴스를 참조하는 코드를 작성해봅시다.
//		인터페이스               인터페이스를 구현한 클래스
		Calculator calc = new Calculator1();
		int a = 20;
		int b = 10;
		System.out.println(calc.add(a, b));
		System.out.println(calc.substract(a, b));
		System.out.println(calc.multiply(a, b));
		System.out.println(calc.divide(a, b));
	}
}