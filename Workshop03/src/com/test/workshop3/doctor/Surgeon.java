package com.test.workshop3.doctor;
public class Surgeon extends Doctor{
//	String surgeonName;
	public Surgeon(String name) {
		super(name, "�ܰ�");
//		this.surgeonName = surgeonName;
	}
	public void performSurgery() {
		System.out.println("������ �����ϴ�.");
	}   
    //TODO Doctor Ŭ���� ��� ���� ��, Ŭ���� �ϼ�
}