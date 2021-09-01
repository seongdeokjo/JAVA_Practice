package com.bitcamp.app.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitcamp.app.member.domain.MemberRegRequest;
import com.bitcamp.app.member.service.MemberRegService2;

@Controller
@RequestMapping("/member/memberReg")
public class MemberRegcontroller {
	@Autowired
//	private MemberRegService service;
	private MemberRegService2 service;

	@RequestMapping(method = RequestMethod.GET)
	public String getRegForm() {
		return "member/memberRegForm";
	}

	@RequestMapping(method = RequestMethod.POST)

	public String memberReg(@ModelAttribute("reg") MemberRegRequest regRequest,HttpServletRequest request,Model model) {
		
		int result = service.memberReg(regRequest, request);
		
	model.addAttribute("result", result);
		
		String view = "member/memberReg" ;
		if(result == 1) {
			// 인텍스 페이지로 리다이렉트
			view = "redirect:/index";
		}
	
		return view;
	}
}