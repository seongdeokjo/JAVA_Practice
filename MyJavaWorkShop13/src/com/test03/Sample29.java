package com.test03;

import java.util.*;

public class Sample29 {

	public static void main(String[] args) {
		ArrayList original = new ArrayList(10);
		ArrayList copy = new ArrayList(10);
		ArrayList copy2	= new ArrayList(10);
		for(int i =0; i < 10; i++) {
			original.add(i+"");
		}
		Iterator itr = original.iterator();
		while(itr.hasNext()) {
			copy.add(itr.next());
		}
		System.out.println("=original에서 copy로 복사(copy) =");
		System.out.println("original:"+ original);
		System.out.println("copy:"+copy);
		
		itr = original.iterator();
		while(itr.hasNext()) {
			copy2.add(itr.next());
			itr.remove();
		}
		System.out.println("=original에서 copy2로 이동(move)=");
		System.out.println("original"+ original);
		System.out.println("copy2 :"+copy2);
	}

}
