package com.test02;
class A1{
	void aMethod()	{
		System.out.println("aMethod in A1");
	}
	@Deprecated
	void bMethod() {
		System.out.println("bMethod in B");
	}
}
public class Sample19 {

	public static void main(String[] args) {
		A1 a = new A1();
		a.aMethod();
		a.bMethod();
	}

}
