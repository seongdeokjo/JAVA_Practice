package com.test03;
interface IDatabase1 {
	void open();
}
class Oracle1 implements IDatabase1 {
	public void open () { 
		System.out.println("Oracle1 open");
	}
}
class MySql1 implements IDatabase1 {
	public void open() {
		System.out.println("MySql open");
	}
}
class SqlServer {
	
}
class DbManager {
	 IDatabase1 db;
	 public DbManager(IDatabase1 db) {
		 this.db = db;
	 }
	 public void run() {
		 this.db.open();
	 }
}
public class Sample07 {

	public static void main(String[] args) {
		DbManager manager = new DbManager(new Oracle1());
		manager.run();
		DbManager manager1 = new DbManager(new MySql1());
		manager1.run();
	}

}
