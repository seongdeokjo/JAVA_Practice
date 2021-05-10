package com.test;
class Employee2 {
	String name;
	int age;
	boolean gender;
	int grade;
	public Employee2() {
		
	}
}
public class Sample05 {
//	static void printEmp(String name, int age, boolean gender, int grade) {
//		Employee2 emp = new Employee2();
//		emp.name = name;
//		emp.age = age;
//		emp.grade = grade;
//		emp.gender = gender;
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(gender);
//		System.out.println(grade);
//	}
	// 클래스 타입으로 만들어 넘기면 출력값만 던져주기만 하면되는 편리함 
	static void printEmp(Employee2 e) {
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.gender);
		System.out.println(e.grade);
	}
	public static void main(String[] args) {
		Employee2 emp = new Employee2();
		printEmp(emp);

	}

}
