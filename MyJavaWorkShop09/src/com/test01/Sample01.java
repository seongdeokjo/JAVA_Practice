package com.test01;

public class Sample01 {

	public static void main(String[] args) {
		Database db = new Oracle("ServerAddress");
		db.open();
	}

}
