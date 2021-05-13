package com.test01;

public class Oracle extends Database {
	
	public Oracle(String connString) {
		this.connString = connString;
	}
	public void setConnString(String connString) {
		this.connString = connString;
	}
	public String getConnString() {
		return this.connString;
	}
	public void open() {
		System.out.println("Oracle open : " + this.connString);
	}
}
