package com.test03;
interface IDatabase {
	public void open();

	public void select();
}
interface IQuery {
	public void select();
}
class Oracle implements IDatabase,IQuery {
	public void open() {
		System.out.println("Oracle open");
	}
	public void select() {
		System.out.println("Oracle query");
	}
}
class MySql implements IDatabase,IQuery {
	public void open() {
		System.out.println("MySql open");
	}
	public void select() {
		System.out.println("MySql query");
	}
}
public class Sample03 {
	static void openDb(IDatabase db) {
		db.open();
	}
	static void selectDb(IDatabase db) {
		db.select();
	}

	public static void main(String[] args) {
		IDatabase db1 = new Oracle();
		Sample03.openDb(db1);
		Sample03.selectDb(db1);
		IDatabase db2 = new MySql();
		Sample03.openDb(db2);
		Sample03.selectDb(db2);
		
	}

}
