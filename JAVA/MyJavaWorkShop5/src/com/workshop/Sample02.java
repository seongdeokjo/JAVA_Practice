package com.workshop;
class Student2{
	String name; //null
	void working() {
		System.out.println(name + "�� ���θ� �ϴ�");
	}
}
public class Sample02 {
	public static void main(String[] args) {
		Student2 stu = new Student2();
		stu.working();
		stu.name = "�������";
		System.out.println(stu.name);
		stu.working();
		Student2 stu2 = new Student2();
		stu2.name = "�̼���";
		stu2.working();
	
	}
}
