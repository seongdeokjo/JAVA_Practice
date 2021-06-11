package com.test01;
import java.util.*;
public class Sample02 {
	public static void main(String[] args) {
//		ArrayList al = new ArrayList();
//		al.add("abc");
//		al.add(1);
//		al.add(10.5);
//		al.add("신");
//		al.add(false);
//		al.set(0, 2);
//	Object obj  =  al.get(0);
//	System.out.println(obj.getClass().getName());
//	Object obj1 = 	al.get(1);
//	Object obj2 = al.get(4);
//	System.out.println(obj1.getClass().getName());
//	System.out.println(obj2.getClass().getName());
//	al.size();
//	for(int inx = 0; inx < al.size(); inx++) {
//		Object o = al.get(inx);
//		System.out.println(o.toString());
//		}
	HashSet h = new HashSet();
	h.add("홍길동");
	h.add("이순신");
	h.add("강감찬");
	h.add("홍길동");
	
	Iterator itr = h.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next());
		}
	}
}
