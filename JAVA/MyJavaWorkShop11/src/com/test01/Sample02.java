package com.test01;

public class Sample02 {

	public static void main(String[] args) {
		Employee e = new Employee("이순신",20);
		Employee e1 = new Employee("이순신",20);
		System.out.println(e.equals(e1));
	}

}
