package com.bitcamp.firstSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {
	
	private String str;
	
	@RequestMapping("/error/error")
	public String getPage() {
		
		str = "string";
		System.out.println(str.charAt(0));
		
		return "index";
	}
	
	@ExceptionHandler(NullPointerException.class)
	public String handleNullPointerExcption(NullPointerException e) {
		e.printStackTrace();
		return "error/nullException";
	}
	
}
