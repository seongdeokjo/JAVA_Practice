package com.workshop;

//ex) �л�   ---> Ŭ���� ����
// �̸�, ����, ...... ������ü 
//�����ϴ�, ��ϴ� , .......���� ��ü
class Student {
	String name;
	int age;
	int grade;
	boolean gender;
	public void study() {
		System.out.println(name + "�� �����Ѵ�.");
	}
	public void exercise() {}	
}
//���
// �̸�, ���
//���ϴ� 
class Employee {
	String name;
	int empNo;
	public void work() {}
}


public class Sample01 {
	public static void main(String[] args) {
		Student gim = new Student(); // ���۷��� Ÿ�� /���������ν� �޸𸮿� ����Ǿ� ��� �� �� �ִ�.
		gim.name = "��";
		gim.age = 30;
		gim.gender = true;
		gim.study();
		Student tim = new Student();// ��ü ���� 
		tim.name = "��";
		tim.age = 40;
		tim.gender = false;
		tim.study();
		Employee john = new Employee();
		Employee susan = new Employee();
		
	}
}
