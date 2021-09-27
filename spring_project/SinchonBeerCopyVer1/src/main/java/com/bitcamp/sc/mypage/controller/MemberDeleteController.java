package com.bitcamp.sc.mypage.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bitcamp.sc.member.domain.LoginInfo;
import com.bitcamp.sc.member.domain.Member;
import com.bitcamp.sc.mypage.service.MypageService;

@Controller
public class MemberDeleteController {
	@Autowired
	MypageService service;

	// 회원 탈퇴 페이지 이동
	@GetMapping("/mypage/delete-id")
	public String deleteIdGet(HttpSession session) {
		if (session.getAttribute("loginInfo") == null) {
			return "member/loginForm";
		}
		return "mypage/delete-id";
	}

	// 회원 탈퇴 실행
	@PostMapping("/mypage/delete-id")
	public String deleteIdPost(HttpSession session) {
		LoginInfo login = (LoginInfo) session.getAttribute("loginInfo");
		service.deleteMember(login.getIdx());

		// 세션 초기화
		session.invalidate();

		return "main";
	}
}
