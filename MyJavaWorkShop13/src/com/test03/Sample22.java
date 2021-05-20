package com.test03;
interface MyFunction1 {
	void mymethod();
}
public class Sample22 {

	public static void main(String[] args) {
		MyFunction1 f = () -> {};
		System.out.println(f);
		System.out.println();
		
		Object obj = (MyFunction1) ( ()-> {} );
		System.out.println(obj);
		System.out.println();
		
		String str = ( (Object) (MyFunction1) ( () ->{}) ) .toString();
		System.out.println(str);
		System.out.println();
		
//		System.out.println(() -> {}); //에러. 람다식은 Object 타입으로 형변환 안됨.
//		System.out.println((MyFunction) (() -> {}).toString()); //에러 
		
//		System.out.println( ( (Object) (MyFunction) ( () -> {}) ).toString() );
	}
}
