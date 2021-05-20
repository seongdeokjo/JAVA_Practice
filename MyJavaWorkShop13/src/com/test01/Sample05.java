package com.test01;

public class Sample05 {
	static <T> void printMsg(T[] names) {
		for(T s : names) {
			System.out.println(s);
		}
	}
	static<E> void printMsg2(E[] names) {
		for(E s : names) {
			System.out.println(s);
		}
	}
	static<E> void add(E a, E b) {
		E temp = a; //temp = 10
		E x =  b; // x = 20;
		E y = temp; // 
		System.out.println(x + ", " + y);
	}
	public static void main(String[] args) {
		String[] names = { "호이","조이","이이"};
		printMsg(names);
		Integer[] arr = {10,20,30,40,50};
		printMsg2(arr);
		Integer a1 = 10;
		Integer b1 = 20;
		add(a1, b1);
	}

}
