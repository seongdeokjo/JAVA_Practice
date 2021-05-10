package com.test;
class Employee {
	String name;
	int empNo;
	public Employee() {
		this("동자", 123);
	}
	public Employee(Employee e) {
		this.name = e.name;
		this.empNo = e.empNo;
		System.out.println(e.name +","+ e.empNo);
	}
	public Employee(String name, int empNo) {
		this.name = name; //static에는 this 불가 
		this.empNo	= empNo;// 생성자
	}
	void working() {
		System.out.println(this.name + "," + this.empNo);
		
	}
	void working(Employee e) {
		System.out.println();
	}
}
public class Sample02 {

	public static void main(String[] args) {
		Employee emp = new Employee("홍길동",40);
		emp.working();
		Employee emp2 = new Employee();
		emp2.working();
		Employee emp3 = new Employee(emp2);
		emp3.working();
		

	}

}
