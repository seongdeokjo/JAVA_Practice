package com.test01;

import java.util.*;

public class Sample14 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		// List al2 = new ArrayList(); // interface type
		al.add(100);
		al.add(200);
		al.add(300);
		// 구조화된 구조
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("==========================================");
		// al.get(0);
		// al.get(1);
		// al.get(2);

		// for(int i = 0; i <al.size(); i++) {
		// int a =(int)al.get(i);
		// System.out.println(a);
		// }
		
		LinkedList ll = new LinkedList();
		ll.add(300);
		ll.add(400);
		ll.add(500);
		Iterator itr2 = ll.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
