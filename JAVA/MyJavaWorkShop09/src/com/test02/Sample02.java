package com.test02;
interface IStudent { //ǥ������ ��Ҹ� ������ 
	public void study();
}
class Student implements IStudent{
	public void study() {
		System.out.println("�л��� �����ϴ�.");
	}
	
}
public class Sample02 {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.study();
		IStudent a = new Student();
		a.study();
	}

}
