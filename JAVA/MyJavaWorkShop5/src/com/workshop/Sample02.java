package com.workshop;
class Student2{
	String name; //null
	void working() {
		System.out.println(name + "은 공부를 하다");
	}
}
public class Sample02 {
	public static void main(String[] args) {
		Student2 stu = new Student2();
		stu.working();
		stu.name = "세종대왕";
		System.out.println(stu.name);
		stu.working();
		Student2 stu2 = new Student2();
		stu2.name = "이순신";
		stu2.working();
	
	}
}
