package com.workshop;
class Data{ int x;}
public class Sample18 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println(d.x);
		
		change(d.x);
		// ȣ���� ������ �Ű����� x�� ���ÿ��� ���ŵǱ� ������ 10�� ���
		System.out.println(d.x);

	}
	static void change(int x) { //�⺻�� �Ű����� 
		x = 1000;
		System.out.println(x);
	}
}
