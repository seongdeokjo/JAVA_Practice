package com.test05;
interface IDatabase {
	public void open();
}
abstract class Database implements IDatabase {
	public void open() {
		System.out.println("Database open");
	}
		abstract void select();
	}

class Oracle extends Database{
	public void select() {
		System.out.println("Oracle open");
	}
}
public class Sample09 {

	public static void main(String[] args) {
		IDatabase db = new Oracle();
		db.open();
		Database db1 = new Oracle();
		db1.open();
		db1.select();
	}

}
