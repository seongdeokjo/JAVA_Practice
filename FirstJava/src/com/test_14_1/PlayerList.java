package com.test_14_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlayerList {

	public static void main(String[] args) {
		List<Player> player = new ArrayList<>();
		
		player.add(new Player("son",7,"tot",28));
		player.add(new Player("park",7,"mu",37));
		player.add(new Player("ebra",3,"mu",38));
		
		Iterator itr = player.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
