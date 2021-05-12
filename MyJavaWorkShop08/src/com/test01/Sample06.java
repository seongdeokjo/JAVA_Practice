package com.test01;

class Student {
	protected String name;
	protected int age;
	Student() {}
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class MiddleStudent extends Student {
	String gender;

	MiddleStudent(String name, int age, String gender) {
		super(name, age); //생성자가 있을경우 
		this.gender = gender;
		System.out.println(this.name + "," + this.age + ", " + this.gender);
	}
}

public class Sample06 {
	public static void main(String[] args) {
		MiddleStudent middle = new MiddleStudent("동", 20, "남");

	}
}