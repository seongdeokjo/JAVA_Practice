package com.test.workshop3.doctor;
<<<<<<< HEAD
public class Dentist extends Doctor {
//	String dentistName;
	public Dentist(String name) {
		super(name, "ġ��");
//		super. //���� ������ private�̶� ���ٺҰ�
	}
	public void pullOutTooth() {
		System.out.println("�̸� �̽��ϴ�.");
	}
}
// TODO Doctor Ŭ���� ��� ���� ��, Ŭ���� �ϼ�
=======

public class Dentist extends Doctor {
//	String dentistName;

	public Dentist(String name, String department) {
		super(name, department);
//		this.dentistName = dentistName;
	}

	public void pullOutTooth() {
		System.out.println("�̸� �̽��ϴ�.");
	}

}

// TODO Doctor Ŭ���� ��� ���� ��, Ŭ���� �ϼ�
>>>>>>> e63fdffb62c4da06ea739f21cc74794b436ab200
