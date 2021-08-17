package com.bitcamp.op.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bitcamp.op.member.domain.Member;
import com.bitcamp.op.member.service.MemberRestService;

@Controller
public class MemberRestController {
	
	@Autowired
	private MemberRestService restService;
	
	@RequestMapping("/members/{id}")
	@ResponseBody
	public Member getMember(
		@PathVariable("id") int idx
			) {
		Member member = restService.getMember(idx);
		System.out.println(member);
		
		
		return member;
	}
	
}
