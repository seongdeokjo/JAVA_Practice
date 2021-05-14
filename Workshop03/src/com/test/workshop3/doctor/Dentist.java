package com.test.workshop3.doctor;
<<<<<<< HEAD
public class Dentist extends Doctor {
//	String dentistName;
	public Dentist(String name) {
		super(name, "치과");
//		super. //조상 변수가 private이라 접근불가
	}
	public void pullOutTooth() {
		System.out.println("이를 뽑습니다.");
	}
}
// TODO Doctor 클래스 상속 받은 후, 클래스 완성
=======

public class Dentist extends Doctor {
//	String dentistName;

	public Dentist(String name, String department) {
		super(name, department);
//		this.dentistName = dentistName;
	}

	public void pullOutTooth() {
		System.out.println("이를 뽑습니다.");
	}

}

// TODO Doctor 클래스 상속 받은 후, 클래스 완성
>>>>>>> e63fdffb62c4da06ea739f21cc74794b436ab200
