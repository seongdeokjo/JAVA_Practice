package com.test_14;

import java.util.*;

public class FootballPlayerList {

	public static void main(String[] args) {
		//1.축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어봅시다. 
		
		List<FootballPlayer> list = new ArrayList<>();
		//데이터 저장
		list.add(new FootballPlayer("손흥민",7,"토트넘",30));
		list.add(new FootballPlayer("메시",5,"바르셀로나",31));
		list.add(new FootballPlayer("이영표",3,"토트넘",40));
		list.add(new FootballPlayer("이영표",3,"토트넘",41));
		list.add(new FootballPlayer("메시",5,"바르셀로나",41));
		
		
	
		//데이터 처리
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}	
	}
}