package com.test01;
class Student {
	String name;
	int age;
	
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		String str = this.name+ ", " + this.age;
		return str;
	}
}
public class Sample03 {

	public static void main(String[] args) {
		Student st = new Student("ÀÚ¹ö",22);
		System.out.println(st);
	}

}
