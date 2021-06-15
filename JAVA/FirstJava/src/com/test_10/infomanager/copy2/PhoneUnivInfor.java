package com.test_10.infomanager.copy2;

public class PhoneUnivInfor extends Friend {
	String major;
	int year;
	String email;
	public PhoneUnivInfor(String name, String phoneNumber, String address, String major,String email,int year) {
		super(name, phoneNumber, address);
		this.major =major;
		this.email = email;
		this.year = year;
	}
	@Override
	public void showData() {
		super.showData();
		System.out.println("전     공:"+ major);
		System.out.println("메     일: "+email);
		System.out.println("학     년: "+year);
		
	}
	public void showBasicInfo() {
		System.out.println("이    름:"+ name);
		System.out.println("전화 번호: "+phoneNumber);
	}
	

}
