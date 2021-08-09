package com.bitcamp.op.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitcamp.op.member.domain.MemberRegRequest;
import com.bitcamp.op.member.service.MemberRegService;

@Controller
@RequestMapping("/member/memberReg")
public class MemberRegcontroller {
	@Autowired
	private MemberRegService service;

	@RequestMapping(method = RequestMethod.GET)
	public String getRegForm() {
		return "member/memberRegForm";
	}

	@RequestMapping(method = RequestMethod.POST)
//	@ModelAttribute("reg")
	public String memberReg( MemberRegRequest regRequest,HttpServletRequest request,Model model) {
		int result = service.regMember(regRequest,request);
			model.addAttribute("result", result);
		return"member/memberReg";
	}
}