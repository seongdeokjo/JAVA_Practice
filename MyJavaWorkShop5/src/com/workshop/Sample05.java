package com.workshop;
class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
}
public class Sample05 {
	public static void main(String[] args) {
	Tv t1 = new Tv();
	Tv t2 = new Tv();
	System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
	System.out.println("t2�� channel���� " + t2.channel+ "�Դϴ�.");
	
	t1.channel  =7;
	System.out.println("t1��channel���� 7�� �����Ͽ����ϴ�.");
	
	System.out.println("t1�� channe����" + t1.channel + "�Դϴ�.");
	System.out.println("t2�� channe����" + t2.channel + "�Դϴ�.");
	}
}
