package com.pr1;

public class PhoneInfo {
	String name;
	String phoneNumber;
	String birth;
	
	public PhoneInfo(String name, String phoneNumber, String birth) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birth = birth;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : "+phoneNumber);
		System.out.println("생일 : "+ birth);
	}

}
