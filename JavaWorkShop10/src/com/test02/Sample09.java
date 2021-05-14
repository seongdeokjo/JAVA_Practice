package com.test02;
public class Sample09 {
	static void method1() {
		try {
			System.out.println("method1dl 호출되었습니다.");
			return;
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("method1의 finally블럭이 실행됨");
		}
	}
	public static void main(String[] args) {
		Sample09.method1();
		System.out.println("method1의 수행을 마치고 main메서드로 돌아옴");
	}
}
