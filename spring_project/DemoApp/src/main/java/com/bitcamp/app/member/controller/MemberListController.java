package com.bitcamp.app.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.app.member.domain.Member;
import com.bitcamp.app.member.domain.SearchType;
import com.bitcamp.app.member.service.MemberListService;

@Controller
public class MemberListController {
	@Autowired
	private MemberListService service;

	@RequestMapping("/member/list")
	public String getList(SearchType searchType, Model model) {
		
		System.out.println(searchType);
		
		List<Member> list = null;
		
		if (searchType.getKeyword() != null && searchType.getKeyword().trim().length() > 0) {
//			list = service.getMemberList(searchType);
			
		}else {
//			list = service.getList();
		}
		model.addAttribute("memberList", list);

		return "member/list";
	}
}
