package com.test03;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
class Emp {
	private int empid;
	private String empName;
	private String empAddress;
	Emp(int empid, String empName, String empAddress) {
		this.empid = empid;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
}

public class SampleJdbc {
	public static void main(String[] args) {
		ArrayList<Emp> emps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "test", "1234");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			emps = new ArrayList<Emp>();
			while (rs.next()) {
				emps.add(new Emp(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		for (Emp e : emps) {
			System.out.println(e.getEmpid() + ", " + e.getEmpName() + ", " + e.getEmpAddress());
		}
	}
}