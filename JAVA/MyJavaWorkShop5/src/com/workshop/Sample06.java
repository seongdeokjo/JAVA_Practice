package com.workshop;
class Tv1 {
	String color;
	boolean power;
	int channel;
	
	void power( ) { power =! power;}
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
	
}
public class Sample06 {
	public static void main(String[] args) {
		
		Tv1 t;
		t = new Tv1();
		t.channel =7;
		t.channelDown();
		t.channelDown();		
		System.out.println("현재 채널은 " + t.channel + "입니다.");
	}

}
