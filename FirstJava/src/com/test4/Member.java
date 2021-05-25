package com.test4;
public class Member {
	String name;
	String ph;
	String major;
	int grade;
	String email;
	int birth;
	String address;
	public Member(String name, String ph, String major, int grade, String email) {
		this.name = name;
		this.ph = ph;
		this.major = major;
		this.grade = grade;
		this.email = email;
	}
	public Member(String name, String ph, String major, int grade, String email, int birth, String address) {
		this(name, ph, major, grade, email);
		this.birth = birth;
		this.address = address;
	}
	public void info() {
		System.out.println("이름: "+name);
		System.out.println("전화번호: "+ph);
		System.out.println("전공: "+major);
		System.out.println("학년: "+grade);
		System.out.println("이메일주소: "+email);
		System.out.println("생년월일: "+birth);
		System.out.println("주소: "+address);
	}
}