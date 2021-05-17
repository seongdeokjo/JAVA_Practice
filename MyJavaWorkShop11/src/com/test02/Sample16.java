package com.test02;

import java.util.*;

public class Sample16 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		System.out.println("===========================================");
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // list1[1-3] 을 list2에 저장
		
		
		print(list1, list2);
		System.out.println("===========================================");
		Collections.sort(list1); // 오름차순으로 숫자 정렬
		Collections.sort(list2);
		print(list1, list2);
		System.out.println("===========================================");
		System.out.println("list.1.containsAll(list2) : " + list1.containsAll(list2));  // list2가 list1에 포함되어있는지 체크
		System.out.println("===========================================");
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		System.out.println("===========================================");
		list2.set(3, "AA");
		print(list1, list2);
		System.out.println("===========================================");
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		System.out.println("===========================================");
		for (int i = list2.size()-1; i >= 0; i--) {
			if (list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
		System.out.println("===========================================");
	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 :" + list1);
		System.out.println("list2 :" + list2);
	}

}
