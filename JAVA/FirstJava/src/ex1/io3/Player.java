package ex1.io3;

import java.io.Serializable;
import java.util.*;

import com.test_14.FootballPlayer;

public class Player implements Serializable,Comparable<Player>{
	String name;
	int number;
	String team;
	int age;
	public Player(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}
	
	public void showData() {
		System.out.println("이름:"+name);
		System.out.println("번호:"+number);
		System.out.println("팀:"+team);
		System.out.println("나이:"+age);
	}
	public int hashCode() {
		return age % 3;
	}

	@Override
	public int compareTo(Player o) {
		int result = this.team.compareTo(o.team);
		//같은 팀이라면 
		if(result == 0) {
		
			result = this.name.compareTo(o.name);
			//이름이 같다면 
			if(result == 0) {
				// 나이로 비교해서 정렬
				
				result = this.age - o.age;
			}
		}
		
		return result;
	}
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null && obj instanceof Player) {
			Player fb = (Player) obj;
			if (this.team.equals(fb.team) && this.name.equals(fb.name)) {
				result = true;
			}
		}
		return result;
	}
	
	public String toString() {
		return team+ name +age +number;
	}
	
	
}
