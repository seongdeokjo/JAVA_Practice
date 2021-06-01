package com.test_14_1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PlayerTreeSet {

	public static void main(String[] args) {
		Set<Player> player = new TreeSet<>();
		
		player.add(new Player("son",7,"tot",28));
		player.add(new Player("son",6,"tot",29));
		player.add(new Player("son1",6,"tot",26));
		player.add(new Player("park2",10,"mu",37));
		player.add(new Player("park2",7,"mu",30));
		player.add(new Player("cha",2,"ch",40));
		player.add(new Player("cha1",8,"ch",33));
		player.add(new Player("son",11,"tot",28));
		
		System.out.println("요소의 개수 :"+player.size());
		
		Iterator<Player> itr = player.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
