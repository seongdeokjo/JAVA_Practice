package com.test3;
public class Person {
	//인스턴스 변수의 경우 초기화를 생략 가능
	String name;
	//주민등록 번호 rrn(resident registration number)
	String rrn;
	int age;	
	String gender;
	public Person(String name, String rrn,int age,String gender) {
		this.name = name;
		this.rrn = rrn;	
		this.age = age;
		this.gender = gender;
	}
	public void showData() {
		System.out.println("이름: "+name);
		System.out.println("주민등록번호: "+rrn);;
		System.out.println("나이: "+age);
		System.out.println("성별: "+gender);
	}
	public void genderCheck() {
		if(gender.equals("남자")) {
			System.out.println("남자입니다.");
		}else if(gender.equals("여자")){
			System.out.println("여자입니다.");
		}else {
			System.out.println("올바른 성별을 입력해주세요.");
		}
	}
	public String toString() {
		return "저는 "+name+"이고 "+age+" 살 입니다.";
	}
}