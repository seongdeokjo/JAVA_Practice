package com.test1;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample03 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1); //value type�� �ƴ� refernece type���� �ٲ� ����.
		al.add("����");
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
