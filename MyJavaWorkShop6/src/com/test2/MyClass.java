package com.test2;
// class ������ 
// public = ��� ��Ű������ ��밡��
// default = ���� ��Ű���ȿ����� ��밡�� 
public class MyClass {
	public int add(int a, int b) {
		return a + b;
	}
	int add(int a, int b, int c) {
		return a + b;
	}
	private String add(String s, String t) {
		return s + t;
	}
	private void testMethod() {
		add("�ȳ��ϼ���","�̼���");
	}
}
