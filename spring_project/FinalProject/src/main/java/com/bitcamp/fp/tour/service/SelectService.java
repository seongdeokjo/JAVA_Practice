package com.bitcamp.fp.tour.service;

import java.sql.Date;

import javax.xml.crypto.Data;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.fp.tour.dao.TourDao;

@Service
public class SelectService {
	
	private TourDao dao;
	@Autowired
	private SqlSessionTemplate template;
	public int count(String date) {
		Date d = Date.valueOf(date);
		dao = template.getMapper(TourDao.class);
		
		
		return dao.selectCount(d);
	}
	
	
}
