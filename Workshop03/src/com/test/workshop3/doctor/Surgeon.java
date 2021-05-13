package com.test.workshop3.doctor;

public class Surgeon extends Doctor{
//	String surgeonName;
	public Surgeon(String name, String department) {
		super(name, department);
//		this.surgeonName = surgeonName;
	}
	public void performSurgery() {
		System.out.println("수술을 집도하다.");
	}
    
    //TODO Doctor 클래스 상속 받은 후, 클래스 완성
}