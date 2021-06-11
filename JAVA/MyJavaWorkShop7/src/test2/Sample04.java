package test2;
class Database {
	 void open() {
		System.out.println("Database open");
	}
}
class Oracle extends Database {
	 void open() { //오버라이딩 
		System.out.println("Oracle open");
	}
	void select_oracle() {
		System.out.println("Oracle select");
	}
}
class MySql extends Database {
	void open() {
		System.out.println("MySql open");
	}
	void select_mysql() {
		System.out.println("MySql select");
	}
}
class Sql_Server extends Database {
	void open() {
		System.out.println("Sql_Server open");
	}
}
public class Sample04 {
	static void openDb(Database db) {
//		 Database db1 = new Oracle();
//		 Database db2 = new MySql();
		 db.open();
	}
	static Database CreateDatabase(String dbName) {
	Database db = null;
		switch(dbName) {
		case "Oracle" :
			db = new Oracle();
			break;
		case "MySql" :
			db = new MySql();
			break;
		case "Sql_Server" :
			db = new Sql_Server();
			break;
		}
		return db;
	}
	static  Oracle openDb1(Oracle db) {
		return db;
	}
	static MySql openDb2(MySql db) {
		return db;
	}
	public static void main(String[] args) {
//		Database db = new Oracle();
//		db.open();
//		Database db2 = new MySql();
//		db2.open();
//		openDb(new Oracle());
//		openDb(new MySql());
		Database db1 = CreateDatabase("Oracle");
		db1.open();
		Database db2= CreateDatabase("MySql");
		db2.open();
		Database db3 = CreateDatabase("Sql_Server");
		db3.open();
		
	}
}
