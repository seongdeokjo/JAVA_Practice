package com.test_14;

import java.util.*;

public class FootballPlayerMap {

	public static void main(String[] args) {
		Map<Integer, FootballPlayer> map = new HashMap<>();
		map.put(7, new FootballPlayer("박지성",7,"맨유",33));
		map.put(5, new FootballPlayer("드록바",5,"첼시",32));
		map.put(3, new FootballPlayer("박주영",3,"서울",34));
		map.put(2, new FootballPlayer("펠레",2,"브라질",35));
		map.put(1, new FootballPlayer("마라도나",1,"아르헨티나",37));
				
		Set<Integer> set = map.keySet();
		Iterator<Integer> itr = set.iterator();
//		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(map.get(itr.next()));
		}	
	}
}