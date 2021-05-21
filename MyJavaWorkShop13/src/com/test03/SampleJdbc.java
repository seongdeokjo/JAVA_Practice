package com.test03;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

class Employee {
	private int empNo;
	private String firstName;
	private String gender;
	public Employee(int empNo, String firstName, String gender) {
		this.empNo = empNo;
		this.firstName = firstName;
		this.gender = gender;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
public class SampleJdbc {
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "1234");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select emp_no, first_name, gender FROM employees.employees");
			while (rs.next()) {
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			emps.add(new Employee(rs.getInt(1), rs.getString(2),rs.getString(3)));;
			}
			
				con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		for(Employee e : emps) {
			System.out.println(e.getEmpNo()+", "+e.getFirstName()+", "+e.getGender());
		}
	}
}