package com.bitcamp.firstSpring;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {

	
	//쿠키 생성해주는 요청 처리
	@RequestMapping(value="/cookie/make")
	public String makeCookie(HttpServletResponse response) {
		Cookie c = new Cookie("uesrname","KING");
		response.addCookie(c);
		
		//Sevice.process(response)
		
		return "cookie/make";
	}
	
	@RequestMapping(value="/cookie/view")
	public String viewCook(
//			@CookieValue(value="uesrnames",required="false") String usernames
			@CookieValue("uesrname") String username,
			Model model
			) {
		
		model.addAttribute("username", username);
		System.out.println(username);
		
		// .. Cookie 정보를 이용해서 데이터 처리		
		return "cookie/view";
	}
	
	
	
}
