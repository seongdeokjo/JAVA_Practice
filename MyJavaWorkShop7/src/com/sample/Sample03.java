package com.sample;
// ���� Ŭ���� 
class Student  { // Student �ڿ� extends Object[�ֻ��� Ŭ����]�� �����Ǿ� �ִ�. 
	String name;
	void studying() {
		System.out.println(name + "�� �����ϴ�.");
	}
}
//���� Ŭ����
class MiddleStudent extends Student {
	void eating() {	System.out.println(name + "�� ���� �Դ´�.");}
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
		m.name = "�浿";
		m.studying();
		Point3D m1 = new Point3D();
		m1.x=  10;
		m1.y = 20;
		m1.z = 30;
		
	}

}
