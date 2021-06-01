package com.test_14;

import java.util.*;

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
		return age %  3;
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
		int result = 0;
		// 팀 정렬 
		if(this.team.compareTo(o.team) > 0) {
			result = 1;
		}else if(this.team.compareTo(o.team) < 0) {
			result = -1;
		}else { // 같은 팀일 경우 이름 순으로 정렬 
			if( this.name.compareTo(o.name) > 0) {
				result =  1;
			}else if(this.name.compareTo(o.name) < 0) {
				result =  -1;
			}else { // 같은 팀 같은 이름일 경우 번호로 정렬 
				if(this.number - o.number > 0) {
					result = 1;
				}else if(this.number - o.number < 0) {
					result =  -1;
				}
			}
		}
		return result;
	}
}