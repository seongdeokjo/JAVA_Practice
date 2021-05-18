package com.test1;

import java.util.Iterator;
import java.util.LinkedList;

public class Sample04 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add("김");
		ll.add(30.0);
		for(Object o : ll) {
			System.out.println(o);
		}
		System.out.println();
		ll.add(0, "대왕"); // 0번째 자리에 값을 밀어 넣는다.
		ll.addFirst("덕"); // 맨처음자리에 값을 넣는다.
		ll.addLast("장군"); // 마지막 자리에 값을 넣는다.
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
