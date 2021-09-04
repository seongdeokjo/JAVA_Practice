package com.bitcamp.app.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.app.member.domain.AuthInfo;
import com.bitcamp.app.member.domain.MemberInfo;
import com.bitcamp.app.member.mapper.JdbcTemplateMemberDao;

@Service
public class AuthService {
	@Autowired
	private JdbcTemplateMemberDao dao;
	
	
	public AuthInfo authenticate(String memail,String mpw) throws Exception  {
		MemberInfo member = dao.selectByEmail(memail);
		if(member == null) {
			throw new WrongIdPasswordException("로그인 정보가 없습니다.");
		}
		if(!member.matchPassword(mpw)) {
			throw new WrongPasswordException("비밀번호 불일치");
		}
		return new AuthInfo(member.getMidx(),member.getMemail());
	}
}
