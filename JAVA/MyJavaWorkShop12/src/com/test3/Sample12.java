package com.test3;

abstract class Student{
	abstract void studying();
}

public class Sample12 {

	public static void main(String[] args) {
		Object o = new Object() {
			void testMethod() {
				System.out.println("testMethod");
			}
		};
		// 추상클래스 Student만 정의하고 
		// 인스턴화시켜서 구현부에서 직접 정의하고 메서드를 호출함. 
		Student stu = new Student() {
			void studying() {
				System.out.println("Student studying");
			}
		};
		stu.studying();
	}
}