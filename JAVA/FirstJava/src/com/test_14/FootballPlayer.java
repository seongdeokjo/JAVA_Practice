package com.test_14;

import java.util.*;

public class FootballPlayer implements Comparable<FootballPlayer> {
	// 축구 선수의 이름, 번호, 팀, 나이
	private String name;
	private int number;
	private String team;
	private int age;

	// 생성자
	FootballPlayer(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 저장된 선수들의 나이를 가지고 3개의 그룹을 만듬
	public int hashCode() {
		return age % 3;
	}

	// 팀과 이름 그리고 나이가 같으면 같은 선수라 판단.
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null && obj instanceof FootballPlayer) {
			FootballPlayer fb = (FootballPlayer) obj;
			if (this.team.equals(fb.team) && this.name.equals(fb.name) && this.age == fb.age) {
				result = true;
			}
		}
		return result;
	}

	public String toString() {
		return "[" + name + ", " + number + ", " + team + ", " + age + "]";
	}
	
	@Override
	public int compareTo(FootballPlayer o) {
		//오름 차순 정렬
		int result = this.team.compareTo(o.getTeam()); //결과는  음수 / 양수 / 0
		//내림 차순 정렬 
//		int result = this.team.compareTo(o.getTeam()) * -1 ; 
//		int result = o.getTeam.compareTo(this.getTeam());

		//같은 팀 정렬
		if(result == 0) {
			result = this.name.compareTo(o.getName());
			// 같은 팀이고 이름이 같은 경우 정렬
			if(result == 0) {
				result = this.number - o.getNumber();
			}
		}
		return result;
//		// 팀 정렬
//		if (this.team.compareTo(o.team) > 0) {
//			result = 1;
//		} else if (this.team.compareTo(o.team) < 0) {
//			result = -1;
//		} else { // 같은 팀일 경우 이름 순으로 정렬
//			if (this.name.compareTo(o.name) > 0) {
//				result = 1;
//			} else if (this.name.compareTo(o.name) < 0) {
//				result = -1;
//			} else { // 같은 팀 같은 이름일 경우 번호로 정렬
//				if (this.number - o.number > 0) {
//					result = 1;
//				} else if (this.number - o.number < 0) {
//					result = -1;
//				}
//			}
//		}
//		return result;
	}
}