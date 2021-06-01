package com.test_14;

import java.util.*;

public class FootballPlayerHashSet {

	public static void main(String[] args) {
		//2. 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고 입력이 되지 않도록 Set<E>컬렉션을 이용행서 축구선수 인스턴스를
		// 저장하고 출력하는 프로그램을 만들어 봅시다. 
		Set<FootballPlayer> set = new HashSet<>();
		set.add(new FootballPlayer("박지성",7,"맨유",31));
		set.add(new FootballPlayer("바지성",8,"맨유",32));
		set.add(new FootballPlayer("박자성",9,"맨시티",33));
		set.add(new FootballPlayer("박지상",7,"첼시",34));
		set.add(new FootballPlayer("박지성",7,"맨유",31));
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}