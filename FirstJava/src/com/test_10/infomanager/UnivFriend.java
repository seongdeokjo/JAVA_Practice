package com.test_10.infomanager;

public class UnivFriend extends Friend {
	String major;
	public UnivFriend(String name, String phoneNumber, String address,String major) {
		super(name, phoneNumber, address);
		this.major = major;
	}
	@Override
	public void showData() {
		super.showData();
		System.out.println("전      공: "+ major);
	}
	@Override
	public void showBasicInfo() {
		System.out.println("이     름: "+name);
		System.out.println("전화번호: "+phoneNumber);
		System.out.println("전     공: "+major );
	}
	

}
