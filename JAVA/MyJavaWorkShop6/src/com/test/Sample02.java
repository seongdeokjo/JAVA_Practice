package com.test;
class Employee {
	String name;
	int empNo;
	public Employee() {
		this("����", 123);
	}
	public Employee(Employee e) {
		this.name = e.name;
		this.empNo = e.empNo;
		System.out.println(e.name +","+ e.empNo);
	}
	public Employee(String name, int empNo) {
		this.name = name; //static���� this �Ұ� 
		this.empNo	= empNo;// ������
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
		Employee emp = new Employee("ȫ�浿",40);
		emp.working();
		Employee emp2 = new Employee();
		emp2.working();
		Employee emp3 = new Employee(emp2);
		emp3.working();
		

	}

}
