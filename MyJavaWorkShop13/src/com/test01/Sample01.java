package com.test01;
interface IStudent{ //객체화 시킬수 없다 불완전하기 때문에 
	public void gotoSchool();
}
class Student implements IStudent {

	@Override
	public void gotoSchool() {
		System.out.println("student go to school.");
	}
	
}

public class Sample01 {
	static void CreateStudent(IStudent stu) {
		stu.gotoSchool();
	}
	public static void main(String[] args) {
//		IStudent stu = new Student();
//		stu.gotoSchool();
		CreateStudent(new Student());
		
	}
}
