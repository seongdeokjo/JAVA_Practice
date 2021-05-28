package com.pr1;

public class PhoneCompanyInfo extends PhoneInfo {
	String company;

	 PhoneCompanyInfo(String name, String phoneNumber, 
			 		  String birth,String company) {
		super(name, phoneNumber, birth);
		this.company = company;
	}
	 public void showInfo() {
	 	System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : "+phoneNumber);
		System.out.println("���� : "+ birth);
		System.out.println("ȸ�� : "+ company);
	 }
	
	
}
