package com.test02;
public class Sample09 {
	static void method1() {
		try {
			System.out.println("method1dl ȣ��Ǿ����ϴ�.");
			return;
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("method1�� finally���� �����");
		}
	}
	public static void main(String[] args) {
		Sample09.method1();
		System.out.println("method1�� ������ ��ġ�� main�޼���� ���ƿ�");
	}
}
