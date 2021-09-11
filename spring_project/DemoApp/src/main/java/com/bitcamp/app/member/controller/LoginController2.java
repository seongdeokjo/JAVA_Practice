package com.bitcamp.app.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitcamp.app.domain.Tour;
import com.bitcamp.app.member.domain.AuthInfo;
import com.bitcamp.app.member.domain.LoginCommand;
import com.bitcamp.app.member.mapper.JdbcTemplateMemberDao;
import com.bitcamp.app.member.service.AuthService;

import lombok.NoArgsConstructor;

@Controller
public class LoginController2 {
	@Autowired
	private AuthService authService;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String getLogin() {
		return "test";
	}

	@PostMapping("/test2")
	public String submit(@ModelAttribute LoginCommand command, HttpServletRequest req,Model model) {
		HttpSession session = req.getSession();
		model.addAttribute("tour", new Tour());
		System.out.println(command);
		try {
			AuthInfo authInfo = authService.authenticate(command.getMemail(), command.getMpw());
			session.setAttribute("authInfo", authInfo);
			
			System.out.println(authInfo.getMemail() +":"+authInfo.getMidx());
			return "redirect:/c";
		} catch (Exception e) {
			return "test";
		}
		
	}
	@RequestMapping("/c")
	public String getTour() {
		
		return "test2";
	}
	
	@GetMapping("/test2")
	public String getTo() {
		return "test2";
	}

}
