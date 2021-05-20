package com.test03;
abstract class MyEnum<T extends MyEnum<T>> implements Comparable<T> {
	static int id = 0;
	int ordinal ;
	String name = "";
	
	public int ordinal() {
		return ordinal;
	}
	MyEnum(String name){
		this.name =name;
		ordinal =id ++;
	}
	public int compareTo(T t) {
		return ordinal - t.ordinal;
	}
}
abstract class MyTransportation extends MyEnum {
	private	MyTransportation(String name, int basicFare) {
		super(name);
		Basic_Fare = basicFare;
	}

	static final MyTransportation Bus = new MyTransportation("Bus",100) {
		int fare(int distance) {
			return distance * Basic_Fare;
		}
	};
	static final MyTransportation Train = new MyTransportation("train",150) {
		int fare(int distance) {
			return distance * Basic_Fare;
		}
	};
	static final MyTransportation Ship = new MyTransportation("ship",100) {
			int fare(int distance) {
				return distance * Basic_Fare;
			}
		};
		static final MyTransportation Airplane = new MyTransportation("airplane",300) {
			int fare(int distance) {
				return distance * Basic_Fare;
			}
		};
		abstract int fare(int distance);
		protected final int Basic_Fare;
		public String toString() {
			return name;
		}
		public String name() {
			return name;
		}
		
	
}
public class Sample26 {

	public static void main(String[] args) {
		MyTransportation t0 = MyTransportation.Bus;
		MyTransportation t = MyTransportation.Bus;
		MyTransportation t1 = MyTransportation.Train;
		MyTransportation t2 = MyTransportation.Ship;
		MyTransportation t3 = MyTransportation.Airplane;
		
		System.out.printf("t=%s, %d%n",t.name(),t0.ordinal());
		System.out.printf("t=%s, %d%n",t.name(),t.ordinal());
		System.out.printf("t=%s, %d%n",t1.name(),t1.ordinal());
		System.out.printf("t=%s, %d%n",t2.name(),t2.ordinal());
		System.out.printf("t=%s, %d%n",t3.name(),t3.ordinal());
		System.out.println("t0 == t1 ?"+(t0==t));
		System.out.println("t0.compareTo(t1) ?"+t0.compareTo(t1));
		
	}

}
