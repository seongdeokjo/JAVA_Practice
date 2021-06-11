package com.test1;
class Person {
	int a;
	Person(int a){
		this.a = a;
	}
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) {
			Person p = (Person)obj;
			return this.a == p.a;
		}else {
			return false;
		}
	}
	public String toString() {
		return getClass().getName()+ " 클래스입니다.";
	}
}
public class Sample01 {

	public static void main(String[] args) {
		Person p1 = new Person(10);
		Person p2 = new Person(10);
		System.out.println(p1 == p2); //범용적으로 사용됨 
		System.out.println(p1.equals(p2)); //객체 비교시사용
		System.out.println(p1.toString());
	}

}
