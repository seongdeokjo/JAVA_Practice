package com.test_14_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PlayerMap {

	public static void main(String[] args) {
		Map<Integer,Player> player = new HashMap<>();
		
		player.put(1, new Player("son",1,"tot",29));
		player.put(7, new Player("park",7,"mu",39));
		player.put(3, new Player("H",3,"mu",38));
		player.put(5, new Player("cha",5,"ac",33));
		player.put(2, new Player("boom",2,"ps",31));
		
		Set<Integer> player2 = player.keySet();
		Iterator itr = player2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(player.entrySet());
	}

}
