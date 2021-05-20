package com.pr9;

import java.util.*;

class Computer implements Comparable {
	int serial ;
	String owner;
	Computer(int serial, String owner){
		this.serial = serial;
		this.owner = owner;
	}

	@Override
	public int compareTo(Object o) {
		return this.serial- ((Computer)o).serial;
	}
	public String toString() {
		return serial+" "+owner;
	}
}
public class CollerctionsDemo {

	public static void main(String[] args) {
		List<Computer> computers = new ArrayList<Computer>();
		computers.add(new Computer(500, "joe"));
		computers.add(new Computer(200, "egoing"));
		computers.add(new Computer(3233, "leezche"));
		Iterator i = computers.iterator();
		System.out.println("before");
		while(i.hasNext()) {
			System.out.println(i.next());			
		}
		Collections.sort(computers);
		System.out.println("\nafter");
		i = computers.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
