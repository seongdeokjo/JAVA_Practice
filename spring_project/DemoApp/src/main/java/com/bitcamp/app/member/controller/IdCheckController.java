package com.bitcamp.app.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitcamp.app.member.service.IdCheckService;

@Controller
public class IdCheckController {
	
	@Autowired
	IdCheckService service;
	
	@RequestMapping(value="/member/idcheck",method=RequestMethod.POST)
	@CrossOrigin
	public String idcheck(@RequestParam("mid") String uid,Model model) {
	
		String result =	service.idcheck(uid);
		
		model.addAttribute("result", result);
		
		return "member/idcheck";
	}
}
