package com.bitcamp.firstSpring.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitcamp.firstSpring.member.domain.LoginRequest;

@Controller
@RequestMapping("/member/login")
public class LoginController {
	
	
//	@RequestMapping(value="/member/login", method=RequestMethod.GET)
	@RequestMapping(method=RequestMethod.GET)
	public String getLoginForm() {
//		@RequestParam("page") int page
//		System.out.println(page+1);
		
		return "member/loginForm"; // /WEB-INF/views/member/loginForm.jsp
	}
	
	//@RequestMapping(value = "/member/login", method=RequestMethod.POST)
	@RequestMapping(method=RequestMethod.POST)
	public String login(
			
			@RequestParam("id") String id,
			@RequestParam("pw") String pw,
			HttpServletRequest request,
			LoginRequest loginRequest
			) {
		
		//사용자의 파라미터 데이터를 받는 방법
		//1. HttpServletRequest 이용
		//2. @RequestParam("param name")
		//3. 커맨드 객체(Beans) 이용
		
		System.out.println(id+ " : " +pw);
		
		String uid = request.getParameter("id");
		String upw = request.getParameter("pw");
		
		System.out.println(uid+" : "+ upw);
		
		System.out.println(loginRequest);
		
		return "member/login"; // /WEB-INF/views/member/login.jsp
	}
}