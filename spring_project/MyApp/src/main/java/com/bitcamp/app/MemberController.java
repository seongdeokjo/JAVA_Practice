package com.bitcamp.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping("/member")
	public String page(){
		return "member";
	}
	
	@RequestMapping("/member2")
	public String page1(){
		return "member2";
	}
	
}
