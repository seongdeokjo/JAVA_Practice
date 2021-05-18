package com.test1;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample03 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1); //value type이 아닌 refernece type으로 바뀌어서 들어간다.
		al.add("람다");
		al.add(20.0);
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i).getClass().getName());
			System.out.println(al.get(i).toString());
		}
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
