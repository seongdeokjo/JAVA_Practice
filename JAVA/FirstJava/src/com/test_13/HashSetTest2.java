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
		this.num = n;
	}
	
	@Override
	public int hashCode() {
		return num % 3; // 0, 1, 2 3개의 그룹이 만들어짐 
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		// obj 는 null이 아니고, obj는 SimpleNumber 타입으로 형변환이 가능해야 한다. 
		if(obj != null && obj instanceof SimpleNumber) {
			SimpleNumber sNum = (SimpleNumber) obj;
			if(this.num == sNum.num) {
				result =  true;
				//return true ; 리턴 값을 직접반환하는 것보단 변수를 통해 값을 보내는 것이 좀 더 안전하다.!
			}
		}
		
		return result;
	}

	public String toString() {
		return String.valueOf(num);
	}
}