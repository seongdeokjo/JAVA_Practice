package com.test_13;

import java.util.*;

public class HashSetTest {

	public static void main(String[] args) {
		// HashSet 저장 공간 생성 : 
		//인스턴스 저장, 
		//중복 저장을 허용하지 않는다. 
		//저장순서를  저장하지 않는다.
		
//		HashSet<String> hashSet = new HashSet<String>();
		HashSet<Integer> hashSet = new HashSet<Integer>();
		//데이터 저장
//		hashSet.add("First");
//		hashSet.add("Second");
//		hashSet.add("Third");
//		hashSet.add("First");
//		hashSet.add("abc");
		
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(3);
		hashSet.add(1);
		hashSet.add(2);
		
		//데이터 일괄 처리
//		Iterator<String> itr = hashSet.iterator();
		Iterator<Integer> itr = hashSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}	
	}
}
