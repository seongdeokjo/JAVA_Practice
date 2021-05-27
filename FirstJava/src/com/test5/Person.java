package com.test5;

import java.util.Scanner;

public class Person {
	String name;
	String personNumber;
	Person(String name,String personNumber){
		this.name = name;
		this.personNumber = personNumber;
	}
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Person) {
			if(((Person)obj).personNumber == personNumber) {
				result = true;
			}
		}
		return result;
			

	}
	
	public static void main(String args[]) {
		Person person = new Person("홍길동","000-1000");
		Person person1 = new Person("김길동","000000-20000000"); 
		System.out.println("같은 주민등록번호인가요?"+(person == person1));
		System.out.println(person.equals(person1));
		
		Scanner scan = new Scanner(System.in);
		System.out.print("주민 등록번호를 입력해주세요 >\n");
		System.out.println("=========결과===========");
		person.equals(scan.nextLine());
		
	}
}
