package com.test01;

public class Sample04 {

	public static void main(String[] args) {
//		Oracle oracle = new Oracle();
//		oracle.open();
//		oracle.select_orcale();
//		MySql mysql = new MySql();
//		mysql.open();
//		mysql.select_mysql();
		openDb(new Oracle());
		openDb(new MySql());
		selectDb(new Oracle());
		selectDb(new MySql());
	}
	static void openDb(Database db) {
		db.open();
	}
	static void selectDb(Database db) {
		db.select();
	}
}
