package com.test_14_1;

public class Player implements Comparable<Player>{
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
	
	public int hashCode() {
		return age % 10;
	}
	
	@Override
	public int compareTo(Player o) {
		int result = this.team.compareTo(o.team);
		if(result == 0) {
			result = this.name.compareTo(o.name);
			if(result == 0) {
				result = this.number - o.number;
			}
		}
		return result;
	}
	
	public boolean equals(Object obj) {
		boolean check = false;
		if(obj != null && obj instanceof Player) {
			Player p = (Player)obj;
			if(this.team.equals(p.team) && this.name.equals(p.name) && this.age == p.age) {
				check = true;
			}
		}
		return check;
	}
	
	
	public String toString() {
		return "["+name+", "+number+", "+team+", "+age+"]";
	}
}
