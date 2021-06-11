package com.test1;

import java.util.*;

public class Sample05 {
	public static void main(String[] args) {
		
	
	Set s1 = new HashSet();
	s1.add(1);
	s1.add(2);
	s1.add(3);
	s1.add(2);
	Iterator itr = s1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
	}
}
