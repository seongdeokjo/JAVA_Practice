package com.test_12;

public class Person {
	String name;
	String personNumber;
	
	Person(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}
// 	Person클래스의 equals()메소드를 오버라이딩 해서 
//	주민등록 번호가 같으면 인스턴스로 판별하는 프로그램을 만들어보자. 
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person)obj;
		return	this.personNumber == p.personNumber;
			
		}else {
			return false;
		}
	}
	
	public static void main(String args[]) {
		Person p1 = new Person("홍길동","900000-1000000");
		Person p2 = new Person("강감찬","900000-1000001");
		Person p3 = new Person("강한","900000-1000000");
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
	}
}
