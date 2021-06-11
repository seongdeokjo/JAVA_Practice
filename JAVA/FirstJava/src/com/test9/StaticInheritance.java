package com.test9;

public class StaticInheritance {

	public static void main(String[] args) {
		Adder ad = new Adder();
		AdderFriend af = new AdderFriend();
		ad.add(1);
		af.friendAdd(3);
		AdderFriend.val += 5;
		af.showVal();
	}

}
