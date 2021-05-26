package com.test3;

import java.util.Calendar;

//Person 클래스를 정의 
class Person {

	// 인스턴스 변수의 경우 초기화를 생략 가능
	// 주민등록 번호 rrn(resident registration number)
	// 이름을 저장하는 변수,주민등록번호를 저장하는 변수를 정의
	// 성별을 저장하는 변수를 정의
	String name;
	String rrn;
	String gender;

	// 생성자를 정의해서 인스턴스 변수들을 초기화
	public Person(String name, String rrn,  String gender) {
		this.name = name;
		this.rrn = rrn;
		this.gender = gender;
	}

	// 인사하는 메소드를 정의
	public void insa() {
		System.out.println("안녕하세요 저는 " + name + "입니다." + ageCal(rrn) + "살 입니다.");
	}
	int ageCal(String rrn) {
		char[] a = rrn.toCharArray();
		// 뒷자리 첫번째 숫자가 1,2 일 경우  1900년대 생 
		if(a[7] == '1' || a[7] == '2') {
			int yy = 1900 +Integer.parseInt(rrn.substring(0, 2));
			int age = Calendar.getInstance().get(Calendar.YEAR) - yy -1;
			return age;
			// 뒷자리 첫번째 숫자가 3,4일경우 2000년대생
		}else if(a[7] == '3' || a[7] == '4') {
			int yy = 2000 +Integer.parseInt(rrn.substring(0, 2));
			int age = Calendar.getInstance().get(Calendar.YEAR) - yy -1;
			return age;
		}
		//값이 잘못 입력된 경우 
		return 0;

//		if(Integer.parseInt(rrn.substring(7,8)) == 1 || Integer.parseInt(rrn.substring(7,8)) == 2 ) {
//			int yy = 1900 +Integer.parseInt(rrn.substring(0, 2));
//			int age = Calendar.getInstance().get(Calendar.YEAR) - yy -1;
//			return age;
//	
//		}else if(Integer.parseInt(rrn.substring(7,8)) == 3 ||Integer.parseInt(rrn.substring(7,8)) == 4) {
//			int yy = 2000 +Integer.parseInt(rrn.substring(0, 2));
//			int age = Calendar.getInstance().get(Calendar.YEAR) - yy -1;
//			return age;
//		}
//		return 0;
		
	}
}

// Person 클래스를 상속
class Male extends Person {
	private String hobby;

	public Male(String name, String rrn, String hobby) {
		super(name, rrn, "남자");
		this.hobby = hobby;

	}

	public void insa() {
		System.out.println("안녕하세요 저는 " + name + "입니다." + ageCal(rrn) + "살 입니다.");
		System.out.println("성별은 " + gender + "입니다.");
		System.out.println("저의 취미는 " + getHobby() + "입니다.");
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

}

// Person 클래스를 상속
class Female extends Person {
	private String hobby;

	public Female(String name, String rrn,  String hobby) {
		super(name, rrn, "여자");
		this.hobby = hobby;
	}

	public void insa() {
		System.out.println("안녕하세요 저는 " + name + "입니다." + ageCal(rrn) + "살 입니다.");
		System.out.println("성별은 " + gender + "입니다.");
		System.out.println("저의 취미는 " + getHobby() + "입니다.");
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}

public class PersonTest {
	public static void main(String[] args) {
		Person male = new Male("둘리", "950112-1000000","운동");
		Person female = new Female("릴리", "980222-2000000","요리");
		Person male1 = new Male("왈리","020000-30000000","음악감상");
		Person female2 = new Female("길리","021111-2000000","영화감상");
		male.insa();
		male1.insa();
		System.out.println("============================");
		female.insa();
		female2.insa();
	}
}