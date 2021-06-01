package com.test_14;

public class FootballPlayer implements Comparable<FootballPlayer>{
	String name;
	int number;
	String team;
	int age;
	FootballPlayer(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
		
	}
	public int hashCode() {
		return age % 5;
	}
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj != null && obj instanceof FootballPlayer) {
			FootballPlayer fb = (FootballPlayer) obj;
			if(this.team == fb.team && this.name == fb.name && this.age == fb.age) {
				result = true;
			}
		}
		return result;
	}
	public String toString() {
		return name + ", "+number+", "+team+", "+age;
	}
//	public String toString() {
//		return String.valueOf(age);
//	}
	
	@Override
	public int compareTo(FootballPlayer o) {
		if(this.name.length() - o.name.length()) {
			
		}
		return ;
	}
	
	
	
	public static void main(String[] args) {
		//1.축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어봅시다. 
		
//		List<FootballPlayer> list = new ArrayList<>();
		//데이터 저장
//		list.add(new FootballPlayer("손흥민",7,"토트넘",30));
//		list.add(new FootballPlayer("메시",5,"바르셀로나",31));
//		list.add(new FootballPlayer("이영표",3,"토트넘",40));
//		
		//데이터 처리
//		Iterator itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
		//2. 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고 입력이 되지 않도록 Set<E>컬렉션을 이용행서 축구선수 인스턴스를
		// 저장하고 출력하는 프로그램을 만들어 봅시다. 
//		Set<FootballPlayer> set = new HashSet<>();
//		set.add(new FootballPlayer("박지성",7,"맨유",31));
//		set.add(new FootballPlayer("바지성",8,"맨유",32));
//		set.add(new FootballPlayer("박자성",9,"맨시티",33));
//		set.add(new FootballPlayer("박지상",7,"첼시",34));
//		set.add(new FootballPlayer("박지성",7,"맨유",31));
//		
//		Iterator itr = set.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		//3. TreeSet<E>을 이용해서 팀 이름순으로 정렬하고, 같은 팀의 선수들은 이름 순으로 정렬하고,
		// 같은 이름의 선수는 번호 순으로 저장하는 프로그램을 만들어 봅시다.
		
		
		
		
		
		
	}
}