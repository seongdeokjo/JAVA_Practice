package com.test06;

public class Sample12 {

	public static void main(String[] args) {
		try {
			int a = 1/0;
		}catch (OutOfMemoryError ex) {
			System.out.println("OutOfMemoryError ���� �߻�");
		}catch (ArithmeticException ex) {
			String name = ex.getMessage();
			System.out.println(name);
			System.out.println("ArithmeticException ���� �߻�");
		}catch (Exception ex) {
			System.out.println("Exception ���� �߻�");
		}
		System.out.println("�����մϴ�.");
	}

}
