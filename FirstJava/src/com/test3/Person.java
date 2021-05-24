package com.test3;

public class Person {
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
	public String toString() {
		return "저는 "+name+" 입니다."+age+" 살 입니다.";
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
}
