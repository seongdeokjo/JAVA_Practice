package com.bitcamp.firstSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeaderController {
	
	@RequestMapping("/header/header")
	public String getHeader(
			@RequestHeader("referer") String reString,
			Model model 
			) {
		
		model.addAttribute("re", reString);
		System.out.println(reString);
		
		//return "header/headerInfo";
//		return "redirect:/member/login";
		return "redirect:"+reString;
	}
	
	
	
}