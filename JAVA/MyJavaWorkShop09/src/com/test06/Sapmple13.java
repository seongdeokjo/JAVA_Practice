package com.test06;

class Student {
}

public class Sapmple13 {

	public static void main(String[] args) {
		Student[] a = new Student[3];
		a[0] = new Student();
		try {
			
	
		for(int i = 0; i < a.length;i++) {
			System.out.println(a[i].toString());
		}
		
		}catch(NullPointerException ex) {
			System.out.println(ex.getMessage() + "������ �߻��߽��ϴ�.");
		}catch(Exception ex) {
			System.out.println("�����Դϴ�.");
		}
		System.out.println("����");

	}
}
