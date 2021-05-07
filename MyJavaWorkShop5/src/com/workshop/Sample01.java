package com.workshop;

//ex) 학생   ---> 클래스 생성
// 이름, 나이, ...... 유형객체 
//공부하다, 운동하다 , .......무형 객체
class Student {
	String name;
	int age;
	int grade;
	boolean gender;
	public void study() {
		System.out.println(name + "이 공부한다.");
	}
	public void exercise() {}	
}
//사원
// 이름, 사번
//일하다 
class Employee {
	String name;
	int empNo;
	public void work() {}
}


public class Sample01 {
	public static void main(String[] args) {
		Student gim = new Student(); // 레퍼런스 타입 /정의함으로써 메모리에 적재되어 사용 할 수 있다.
		gim.name = "톰";
		gim.age = 30;
		gim.gender = true;
		gim.study();
		Student tim = new Student();// 객체 생성 
		tim.name = "존";
		tim.age = 40;
		tim.gender = false;
		tim.study();
		Employee john = new Employee();
		Employee susan = new Employee();
		
	}
}
