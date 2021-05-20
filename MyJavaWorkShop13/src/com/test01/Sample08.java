package com.test01;
interface IDatabase<T> {
	void open(T db);
}
class Database<T> implements IDatabase<T> {
	T db;
	public void open(T db) {
		this.db = db;
		System.out.println(db);
	}
	
}
class Oracle{
	public String toString() {
		return "Oracle";
	}
}
public class Sample08 {

	public static void main(String[] args) {
		IDatabase<Oracle> oracle = new Database<Oracle>();
		oracle.open(new Oracle());
	}

}
