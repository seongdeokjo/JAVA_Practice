package com.bitcamp.sc.kakao.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KakaoLoginController {

	@GetMapping("/k/login")
	public String getLoginBykakako() {
		return "kakao/login";
	}
	
}
