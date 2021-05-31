package com.test_10.infomanager;

public class PhoneFamily extends Friend {
	String relationship;
	
	public PhoneFamily(String name, String phoneNumber, String address,String relationship) {
		super(name, phoneNumber, address);
		this.relationship = relationship;
	}
	public void showData() {
		super.showData();
		System.out.println("관      계:"+relationship);
	}
	public void showBasicInfo() {
		System.out.println("이     름: "+name);
		System.out.println("전화번호: "+phoneNumber);
	}
}
