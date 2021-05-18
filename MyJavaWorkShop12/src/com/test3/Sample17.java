package com.test3;

class MyData<T> {
	private T a;

	MyData(T a) {
		this.a = a;
	}

	public T getA() {
		return this.a;
	}
}

public class Sample17 {

	public static void main(String[] args) {
		MyData m = new MyData(11);
		Object o = m.getA();
		int a = (int) o;
		MyData m1 = new MyData(new String("이순신"));
		Object o1 = m1.getA();
		String s = (String) o1;
		MyData<Integer> m2 = new MyData<Integer>(10);
		MyData<String> m3 = new MyData<String>("이순신");
		Integer i = m2.getA();
		String s2 = m3.getA();
		System.out.println(i + s2);
	}

}
