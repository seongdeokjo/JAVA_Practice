package com.sample;
// 상위 클래스 
class Student  { // Student 뒤엔 extends Object[최상위 클래스]가 생략되어 있다. 
	String name;
	void studying() {
		System.out.println(name + "가 공부하다.");
	}
}
//하위 클래스
class MiddleStudent extends Student {
	void eating() {	System.out.println(name + "가 밥을 먹는다.");}
}
class Point {
	int x;
	int y;
}
class Point3D extends Point{
	int z;
}

public class Sample03 {

	public static void main(String[] args) {
		MiddleStudent m = new MiddleStudent();
		m.name = "길동";
		m.studying();
		Point3D m1 = new Point3D();
		m1.x=  10;
		m1.y = 20;
		m1.z = 30;
		
	}

}
