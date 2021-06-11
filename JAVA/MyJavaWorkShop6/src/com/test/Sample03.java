package com.test;
class Student2 {
	String name;
	public Student2(String name) {
		this.name = name;
	}
	public Student2(Student2 s) { //s = stu or s = new 
		System.out.println(s.name);
		this.name = s.name;
	}
	void studying() {
		System.out.println(this.name);
	}
}
public class Sample03 {
	static void test(Student2 s) { 
		s.studying();
	}
	public static void main(String[] args) {
		Student2 stu = new Student2("홍길동");
		stu.studying();
		test(stu); //Student2 s = stu; 참초변수 복사
		test(new Student2("이순신")); 
		//Student2 s = new Student2("이순신");
		int a = 1; 
		Student2 stu2 = new Student2("강감찬");
		Student2 stu3 = new Student2(stu2);
		stu3.studying();
	}
}
