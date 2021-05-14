package com.test.workshop3.doctor;
<<<<<<< HEAD
public class Surgeon extends Doctor{
//	String surgeonName;
	public Surgeon(String name) {
		super(name, "외과");
=======

public class Surgeon extends Doctor{
//	String surgeonName;
	public Surgeon(String name, String department) {
		super(name, department);
>>>>>>> e63fdffb62c4da06ea739f21cc74794b436ab200
//		this.surgeonName = surgeonName;
	}
	public void performSurgery() {
		System.out.println("수술을 집도하다.");
<<<<<<< HEAD
	}   
=======
	}
    
>>>>>>> e63fdffb62c4da06ea739f21cc74794b436ab200
    //TODO Doctor 클래스 상속 받은 후, 클래스 완성
}