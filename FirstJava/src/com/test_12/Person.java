package com.test_12;

public class Person {
	String name;
	String personNumber;
// 	Person클래스의 equals()메소드를 오버라이딩 해서 
//	주민등록 번호가 같으면 인스턴스로 판별하는 프로그램을 만들어보자. 
	public boolean equals(String Numer) {
		if(this.personNumber == Numer) {
			return true;
		}else {
			return false;
		}
	}
}
