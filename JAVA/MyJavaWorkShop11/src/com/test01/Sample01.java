package com.test01;

class Person{
	long id;
	Person(long id) {
		this.id = id;
	}
	public boolean equals(Object obj) {
		if((obj != null) && obj instanceof Person) {
			Person p = (Person)obj;
			return this.id== p.id;
		}else {
			return false;
		}
	}
}
public class Sample01 {

	public static void main(String[] args) {
		Person p = new Person(10);
		Person p2 = new Person(10);
		p.equals(p2);
	}
}
