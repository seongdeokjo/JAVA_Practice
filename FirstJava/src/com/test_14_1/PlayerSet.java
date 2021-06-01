package com.test_14_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PlayerSet {

	public static void main(String[] args) {
		Set<Player> player = new HashSet<>();
		
		player.add(new Player("son",7,"tot",28));
		player.add(new Player("park",7,"mu",37));
		player.add(new Player("son",10,"Fc",20));
		player.add(new Player("son",9,"Fc",20));
		player.add(new Player("ji",1,"seoul",21));
		
		System.out.println("요소의 개수 : "+player.size());
		
		Iterator<Player> itr = player.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
	}

}
