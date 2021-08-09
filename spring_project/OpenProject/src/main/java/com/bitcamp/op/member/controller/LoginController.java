package com.bitcamp.op.member.controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitcamp.op.member.service.LoginService;

@Controller
@RequestMapping("/member/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	

	@RequestMapping(method = RequestMethod.GET)
	public String loginForm() {
		return "member/loginForm";
	}
	
	@RequestMapping(method= RequestMethod.POST)
	public String login(
			//@RequestParam -> 2개 이하
			//Command 객체 이용 -> 받을 변수가 많으면 객체로 해서 전달 
			//HttpServletRequest 이용
			@RequestParam("memberid") String memberid,
			@RequestParam("memberpw") String memberpw,
			@RequestParam(value="reid",required = false) String reid,
			HttpSession session,
			HttpServletResponse response,
			Model model
			) {
		
		//사용자가 입력한 id와 pw 서비스에 전달해서 로그인 처리
		boolean loginChk = loginService.login(memberid, memberpw, reid, session, response);
		model.addAttribute("loginChk", loginChk);
		
		
		return "member/login";
	}
	
	
	

}
