package com.test02;
interface IStudent { //표준적인 요소만 디자인 
	public void study();
}
class Student implements IStudent{
	public void study() {
		System.out.println("학생이 공부하다.");
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
