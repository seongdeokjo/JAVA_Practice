package com.test9;


class Adder {

	
	public static int val = 0;
	public void add(int num) {
		val += num;
	}
}
class AdderFriend extends Adder {
	public void friendAdd(int num) {
		val += num;
	}
	public void showVal() {
		System.out.println(val);
	}
}
