package com.bitcamp.op.member.service;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.op.member.dao.Dao;
import com.bitcamp.op.member.dao.JdbcTemplateMemberDao;
import com.bitcamp.op.member.dao.MemberDao;
import com.bitcamp.op.member.dao.MybatisMemberDao;
import com.bitcamp.op.member.domain.Member;

@Service
public class LoginService {

//	@Autowired
//	MemberDao dao;
	
//	@Autowired
//	private JdbcTemplateMemberDao dao;

//	@Autowired
//	private MybatisMemberDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	private Dao dao;
	
	public boolean login(String id, String pw, String reid, HttpSession session, HttpServletResponse response) {
		boolean loginChk = false;
		
		// 인터페이스 Dao 구현체 Mapper
		dao = template.getMapper(Dao.class);
		

		try {
			// 전달받은 id와 pw로 db에서 검색 => 있다면 로그인 처리, 없다면 false 리턴
			Member member = dao.selectByIdPw(id, pw);

			if (member != null) {
				// 로그인 처리
				session.setAttribute("loginInfo", member.toLoginInfo());

				loginChk = true;
			}

		} finally {
		}

		// 아이디 저장을 위한 Cookie 설정
		if (reid != null && reid.length() > 0) {
			Cookie cookie = new Cookie("reid", id);
			cookie.setPath("/");
			// 쿠키의 생명주기 설정
			cookie.setMaxAge(60 * 60 * 24 * 365);
			// 쿠키 저장
			response.addCookie(cookie);
		}else {
			Cookie cookie = new Cookie("reid", id);
			cookie.setPath("/");
			// 쿠키의 생명주기 설정
			cookie.setMaxAge(0);
			// 쿠키 저장
			response.addCookie(cookie);
		}

		return loginChk;
	}
}