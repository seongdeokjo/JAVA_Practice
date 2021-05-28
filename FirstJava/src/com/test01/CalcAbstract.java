package com.test01;
public abstract class CalcAbstract implements Calculator {
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
