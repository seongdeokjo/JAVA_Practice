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
		
//		System.out.println(() -> {}); //����. ���ٽ��� Object Ÿ������ ����ȯ �ȵ�.
//		System.out.println((MyFunction) (() -> {}).toString()); //���� 
		
//		System.out.println( ( (Object) (MyFunction) ( () -> {}) ).toString() );
	}
}
