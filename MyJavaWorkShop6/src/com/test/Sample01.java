package com.test;
class Student {
	String name;
	int age;
	public Student() { //�����ڴ� ���� ���� ����.
		name = "�������";
		age = 30;
	}
	public Student(String nm, int ag) {
		name = nm;
		age = ag;
	}
	void studying() {
		System.out.println(name + "," + age );
	}
}

public class Sample01 {
	
	public static void main(String[] args) {
		Student stu = new Student();
		stu.studying();
		Student stu2 = new Student("������", 50);// �������� �����ε�
		stu2.studying();
	
	}

}
