package com.test_13;

import java.util.*;

public class HashSetTest2 {

	public static void main(String[] args) {
		// HashSet 저장 공간 생성 : 
		//인스턴스 저장, 
		//중복 저장을 허용하지 않는다. 
		//저장순서를  저장하지 않는다.
		
//		HashSet<String> hashSet = new HashSet<String>();
//		HashSet<Integer> hashSet = new HashSet<Integer>();
		HashSet<SimpleNumber> hashSet = new HashSet<>();
		//데이터 저장
//		hashSet.add("First");
//		hashSet.add("Second");
//		hashSet.add("Third");
//		hashSet.add("First");
//		hashSet.add("abc");
		
//		hashSet.add(1);
//		hashSet.add(2);
//		hashSet.add(3);
//		hashSet.add(3);
//		hashSet.add(1);
//		hashSet.add(2);
		
		hashSet.add(new SimpleNumber(10));
		hashSet.add(new SimpleNumber(20));
		hashSet.add(new SimpleNumber(20));
		
		
		
		//데이터 일괄 처리
//		Iterator<String> itr = hashSet.iterator();
//		Iterator<Integer> itr = hashSet.iterator();
		Iterator<SimpleNumber> itr = hashSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}	
	}
}

class SimpleNumber {
	int num;
	SimpleNumber(int n) {
		num = n;
	}
	public String toString() {
		return String.valueOf(num);
	}
}