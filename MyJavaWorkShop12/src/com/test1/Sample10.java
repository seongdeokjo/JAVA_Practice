package com.test1;

import java.util.*;

public class Sample10 {

	public static void main(String[] args) {
		ArrayList original = new ArrayList(10);
		ArrayList copy1 = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);
		
		for(int i = 0; i<10; i++) {
			original.add(i+"");
		}
		Iterator itr = original.iterator();
		while(itr.hasNext())
			copy1.add(itr.next());
		System.out.println("=original에서 copy1로 복사(copy) =");
		System.out.println("original:"+original);
		System.out.println("copy1: "+copy1);
		
		itr = original.iterator();
		while(itr.hasNext()) {
			copy2.add(itr.next());
			itr.remove();
		}
		System.out.println("=original에서 copy2로 이동(move) =");
		System.out.println("original:"+original);
		System.out.println("copy2: "+copy2);
	}

}
