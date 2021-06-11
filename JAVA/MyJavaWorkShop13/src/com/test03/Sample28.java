package com.test03;

import java.util.*;

public class Sample28 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("0");
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		
		ListIterator litr = list.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println();
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}

}
