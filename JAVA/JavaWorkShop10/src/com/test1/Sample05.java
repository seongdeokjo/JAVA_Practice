package com.test1;
class MyException2 extends Exception {
	MyException2(String msg) {
		super(msg);
	}
}
public class Sample05 {
	public static void main(String[] args) {
	int i = 2;
		try {
			if( i == 2) { //������ ���� ��������Ƿ� ���ܹ��� ���� �� �ִ�.
		throw new MyException2("�ȳ��ϼ���"); //���� �߻� ��Ŵ
				}
			}catch(MyException2 e) {
			System.out.println(e.getMessage());	
				}
		}
}
