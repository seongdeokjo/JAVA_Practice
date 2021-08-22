package com.bitcamp.fp.tour.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bitcamp.fp.tour.service.SelectService;

@RestController()
public class SelectController {
	
	@Autowired
	SelectService service;
	
	@GetMapping("/selectcount")
	public int count(@RequestParam("mid") String date) {
		System.out.println(date);
		return service.count(date); 
	}
}
