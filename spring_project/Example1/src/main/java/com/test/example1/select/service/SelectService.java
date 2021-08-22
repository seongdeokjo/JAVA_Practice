package com.test.example1.select.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.example1.jdbc.ConnectionProvider;
import com.test.example1.select.dao.SelectDao;

@Service
public class SelectService {
	
	@Autowired
	SelectDao dao;
	
	public int count(String date) throws ParseException {
		int count = 0;
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
//			Date d1 = (Date) format.parse(date);
		Date d1 = Date.valueOf(date);
		count = dao.countSel(conn, d1);
//		count = dao.countSel(conn, date);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		return count;
	}
	
	
}
