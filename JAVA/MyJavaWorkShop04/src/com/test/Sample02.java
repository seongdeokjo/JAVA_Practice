package com.test;

public class Sample02 {

	public static void main(String[] args) {
		String name = "�̼���";
		String name2 = "������";
		if(name == name2) {
			System.out.println("���� ����̱���.");
		}
		if(name == name2) {
			System.out.println("���� ����̱���");
		} else {
			System.out.println("���� ����� �ƴϱ���.");
		}
		int age = 10;
		if(name == "������") {
			if(age >10) {
			System.out.println("�������Դϴ�.");
			}
		}else if(name == "�������") {
			System.out.println("��������Դϴ�.");
		}else {
			System.out.println("��������.");
		}
		switch(name) {
		case "ȫ�浿" :
			System.out.println("ȫ�浿�Դϴ�.");
			break;
		case "�������" :
			System.out.println("��������Դϴ�.");
			break;
		case "�̼���" :
			System.out.println("�̼����Դϴ�.");
			break;
		default:
		}
	}
}
