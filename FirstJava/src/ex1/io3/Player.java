package ex1.io3;

import java.io.Serializable;

public class Player implements Serializable{
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
		System.err.println("이름:"+name);
		System.err.println("번호:"+number);
		System.err.println("팀:"+team);
		System.err.println("나이:"+age);
	}
	
}
