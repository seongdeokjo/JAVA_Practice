package com.test01;
interface IStudent{ //��üȭ ��ų�� ���� �ҿ����ϱ� ������ 
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
