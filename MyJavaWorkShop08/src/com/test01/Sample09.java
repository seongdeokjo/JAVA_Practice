package com.test01;

abstract class Student3 {
	void studying() {
		System.out.println("Student3 studying");
	}

	abstract void eating();
}

class Student4 extends Student3 {
	public void eating() {
		System.out.println("Student4 eating");
	}
}

public class Sample09 {

	public static void main(String[] args) {
		Student3 s = new Student4();
		s.eating();
		s.studying();
	}

}
