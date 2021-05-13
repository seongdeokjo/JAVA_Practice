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
			System.out.println(ex.getMessage() + "오류가 발생했습니다.");
		}catch(Exception ex) {
			System.out.println("오류입니다.");
		}
		System.out.println("종료");

	}
}
