package com.test06;

public class Sample12 {

	public static void main(String[] args) {
		try {
			int a = 1/0;
		}catch (OutOfMemoryError ex) {
			System.out.println("OutOfMemoryError 오류 발생");
		}catch (ArithmeticException ex) {
			String name = ex.getMessage();
			System.out.println(name);
			System.out.println("ArithmeticException 오류 발생");
		}catch (Exception ex) {
			System.out.println("Exception 오류 발생");
		}
		System.out.println("종료합니다.");
	}

}
