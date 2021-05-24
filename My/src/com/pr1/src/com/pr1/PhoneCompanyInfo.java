package com.pr1.src.com.pr1;

public class PhoneCompanyInfo extends PhoneInfo {
	String company;

	 PhoneCompanyInfo(String name, String phoneNumber, 
			 		  String birth,String company) {
		super(name, phoneNumber, birth);
		this.company = company;
	}
	 public void showInfo() {
	 	System.out.println("이름 : " + name);
		System.out.println("전화번호 : "+phoneNumber);
		System.out.println("생일 : "+ birth);
		System.out.println("회사 : "+ company);
	 }
	
	
}
