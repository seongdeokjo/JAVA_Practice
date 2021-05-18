package com.test3;

import java.util.ArrayList;

interface MyData1<T>{
	T add(T a);
}
class MyData2<T> implements MyData1<T> {
	public T add(T a) {
		return null;
	}
}
class MyDataType {}
public class Sample18 {

	public static void main(String[] args) {
	ArrayList al = new ArrayList();
	ArrayList<String> al2 = new ArrayList<String>();
		al2.add("1");
		al2.add("test");
		ArrayList<MyDataType> al3 = new ArrayList<MyDataType>();
		al3.add(new MyDataType());
		
	}

}
