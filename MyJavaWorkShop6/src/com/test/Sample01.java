package com.test;
class Student {
	String name;
	int age;
	public Student() { //생성자는 리턴 값이 없다.
		name = "세종대왕";
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
		Student stu2 = new Student("강감찬", 50);// 생성자의 오버로딩
		stu2.studying();
	
	}

}
