package com.test_14;

import java.util.*;

public class FootballPlayerTreeSet {

	public static void main(String[] args) {

		// 3. TreeSet<E>을 이용해서 팀 이름순으로 정렬하고, 같은 팀의 선수들은 이름 순으로 정렬하고,
		// 같은 이름의 선수는 번호 순으로 저장하는 프로그램을 만들어 봅시다.

		TreeSet<FootballPlayer> treeSet = new TreeSet<>();
		treeSet.add(new FootballPlayer("박지성", 7, "맨유", 33));
		treeSet.add(new FootballPlayer("루니", 10, "맨유", 34));
		treeSet.add(new FootballPlayer("에브라", 3, "맨유", 36));
		treeSet.add(new FootballPlayer("호날드", 18, "맨유", 32));
		treeSet.add(new FootballPlayer("반데사르", 1, "맨유", 40));
		treeSet.add(new FootballPlayer("드록바", 7, "첼시", 41));
		treeSet.add(new FootballPlayer("메시", 10, "바르셀로나", 30));
		treeSet.add(new FootballPlayer("수아레즈", 7, "바르셀로나", 33));
		treeSet.add(new FootballPlayer("루니", 6, "맨유", 29));
		treeSet.add(new FootballPlayer("조하트", 1, "맨시티", 28));
		treeSet.add(new FootballPlayer("덕배", 5, "맨시티", 32));
		treeSet.add(new FootballPlayer("에투", 8, "가나", 32));
		
		System.out.println("요소의 개수"+treeSet.size());
		Iterator itr = treeSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}