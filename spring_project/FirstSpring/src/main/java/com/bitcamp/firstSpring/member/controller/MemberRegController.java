package com.bitcamp.firstSpring.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitcamp.firstSpring.member.domain.MemberRegRequest;

@Controller
@RequestMapping("/member/regForm")
public class MemberRegController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String getRegForm() {
		return "member/memberRegForm"; // /WEB-INF/views/member/memberRegForm.jsp
	}
	
	@RequestMapping(method =RequestMethod.POST)
	public String regMember(
			@RequestParam(value="memberId",required = false) String memberId,
			@RequestParam(value="memberPw",required = false) String memberPw,
			@RequestParam(value="memberName",required = false) String memberName,
//			@RequestParam("memberPhoto") String memberPhoto,
			HttpServletRequest request,
			@ModelAttribute("reg") MemberRegRequest regRequest,
			Model model

			) {
		String memberid = request.getParameter("memberId");
		String memberpw = request.getParameter("memberPw");
		String membername = request.getParameter("memberName");
//		String memberphoto = request.getParameter("memberPhoto");
		
		System.out.println(memberid+memberpw+membername);
//				memberphoto);
		
		model.addAttribute("memberId", memberId);
		model.addAttribute("memberPw", memberPw);
		model.addAttribute("memberName", memberName);
//		model.addAttribute("memberPhoto", memberPhoto);
		
		model.addAttribute("memberid", memberid);
		model.addAttribute("memberpw", memberpw);
		model.addAttribute("membername", membername);
		
		
		System.out.println(regRequest);
		
		
		
		return "member/memberReg";
	}
}
