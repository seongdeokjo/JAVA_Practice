// value type
// reference type=> object class
package com.test06;
class Employee extends Object {
	public String toString() {
		Integer i = new Integer(this.hashCode());
		return  i.toString();
	}
	
}
public class Sample11 {

	public static void main(String[] args) {
		Employee emp =new Employee();
		String temp = emp.toString();
		System.out.println(temp);
		System.out.println(emp);
		Employee emp2 = new Employee();
		System.out.println(emp2);
		int a = 1;
		Integer a1 = new Integer(1);
		a1.toString();
		System.out.println(a1);
	}

}
