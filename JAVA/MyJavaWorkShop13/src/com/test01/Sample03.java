package com.test01;

class Student2<T> { //타입변수, 타입 매개변수 T 
	T s; // 

	Student2(T s) {
		this.s = s;
	}

	public T getS() {
		return this.s;
	}
}

public class Sample03 {

	public static void main(String[] args) {
		Student2<String> stu = new Student2<String>("Mr.LEE");
		System.out.println(stu.getS());
	}

}
