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
		// �߻�Ŭ���� Student�� �����ϰ� 
		// �ν���ȭ���Ѽ� �����ο��� ���� �����ϰ� �޼��带 ȣ����. 
		Student stu = new Student() {
			void studying() {
				System.out.println("Student studying");
			}
		};
		stu.studying();
	}
}