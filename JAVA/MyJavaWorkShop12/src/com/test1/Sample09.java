package com.test1;

import java.util.*;

class MyList implements Iterable {
	ArrayList al;

	MyList() {
		al=new ArrayList();
	}
	public void addItem(Object o) {
		al.add(o);
	}

	public Iterator iterator() {

		return new MyListIterator();
	}

	class MyListIterator implements Iterator {
		int currentIndex = 0;
		
	
		@Override
		public boolean hasNext() {
			if (currentIndex >= al.size()) {
				return false;
			}else
			return true;
		}

		@Override
		public Object next() {
			return al.get(currentIndex++);
		}
	}
}

public class Sample09 {

	public static void main(String[] args) {
		MyList m = new MyList();
		m.addItem(1);
		m.addItem(2);
		Iterator itr = m.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(Object o : m) {
			System.out.println(o);
		}
//		Iterator itr = m1.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}

}
