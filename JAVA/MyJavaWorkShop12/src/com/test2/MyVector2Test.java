package com.test2;

import java.util.*;

public class MyVector2Test {

	public static void main(String[] args) {
		MyVector2 v = new MyVector2();
		v.add("0");
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		
		System.out.println("삭제전 :"+v);
		Iterator itr = v.iterator();
		itr.next();
		itr.remove();
		itr.next();
		itr.remove();
		System.out.println("삭제 후:"+v);
		
	}

}
