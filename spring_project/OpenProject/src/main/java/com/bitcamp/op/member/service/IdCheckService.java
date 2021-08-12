package com.bitcamp.op.member.service;

import java.sql.SQLException;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.op.member.dao.Dao;
import com.bitcamp.op.member.dao.JdbcTemplateMemberDao;
import com.bitcamp.op.member.dao.MemberDao;
import com.bitcamp.op.member.dao.MybatisMemberDao;

@Service
public class IdCheckService {
	
//	@Autowired
//	MemberDao dao;
	
//	@Autowired
//	JdbcTemplateMemberDao dao;
	
//	@Autowired
//	private MybatisMemberDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	private Dao dao;
	
	
	public String idcheck(String id) {
		String result = "Y";
		
		//인터페이스의 메퍼 Dao 생성
		dao = template.getMapper(Dao.class);
		
		if(dao.selectById(id) > 0) {
			result = "N";
		}
				
		return result ;
	}
}