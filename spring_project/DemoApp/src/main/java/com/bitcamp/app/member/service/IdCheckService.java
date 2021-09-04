package com.bitcamp.app.member.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.app.member.mapper.MemberMapper;

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
	
	private MemberMapper dao;
	
	
	public String idcheck(String id) {
		String result = "Y";
		
		//인터페이스의 메퍼 Dao 생성
		dao = template.getMapper(MemberMapper.class);
//		
//		if(dao.selectById(id) > 0) {
//			result = "N";
//		}
				
		return result ;
	}
}