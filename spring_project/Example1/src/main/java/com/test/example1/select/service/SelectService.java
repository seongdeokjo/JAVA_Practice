package com.test.example1.select.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.example1.jdbc.ConnectionProvider;
import com.test.example1.select.dao.SelectDao;

@Service
public class SelectService {
	
	@Autowired
	SelectDao dao;
	
	public int count(String date) {
		int count = 0;
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			Date d1 = Date.valueOf(date);
			
		count = dao.countSel(conn, d1);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		return count;
	}
	
	
}
