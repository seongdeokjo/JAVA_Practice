package com.pr1.src.com.pr1;

public class PhoneUnivInfo extends PhoneInfo {
	String major;
	int year;
	PhoneUnivInfo(String name, String phoneNumber, String birth,
				  String major, int year) {
		super(name, phoneNumber, birth);
		this.major = major;
		this.year = year;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("전공 : "+major);
		System.out.println("학년 : "+year);
	}
	
	
}
