package com.test.workshop3.doctor;
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