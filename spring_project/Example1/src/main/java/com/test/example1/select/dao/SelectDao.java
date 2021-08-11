package com.test.example1.select.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;


@Repository
public class SelectDao {
	
	
	public int countSel(Connection conn,Date rsdate ) {
		int result = 0;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sqlSel = "select (totalpeople-curpeople)  as available from rs where rsdate=?";
		
		try {
			pstmt = conn.prepareStatement(sqlSel);
			pstmt.setDate(1, rsdate);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getInt(1);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	
	
		return result;
	}
	
	
	
	
	
	
}
