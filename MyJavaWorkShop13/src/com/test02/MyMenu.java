package com.test02;
public enum MyMenu{
	Set1(1000),
	Set2(3000);
	
	private int a;
	private MyMenu(int a) {
		this.a = a;
	}
	public int getA() {
		return	this.a;
	}
}
