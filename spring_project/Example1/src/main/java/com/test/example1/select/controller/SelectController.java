package com.test.example1.select.controller;

import java.sql.Date;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.example1.select.service.SelectService;

@Controller
public class SelectController {
	@Autowired
	SelectService service;
	
	@RequestMapping(value="/select",method = RequestMethod.GET)
	public String getSelectForm() {
		return "selectForm";
	}
	
	@RequestMapping(value="/select",method=RequestMethod.POST)
	public String getSelect(
		@RequestParam("date") String date,
		@RequestParam("select") int count,
		@RequestParam("tour") String tour,
		Model model
			) {
		model.addAttribute("date", date);
		model.addAttribute("count",count);
		model.addAttribute("tour", tour);
		
		return "selectPost";
	}
	
	
	

//	@RequestMapping(value="/selectResult",method = RequestMethod.POST)
	@RequestMapping(value = "/selectResult")
	public String result(
			@RequestParam(value = "mid") String date,
			
			Model model)
			throws ParseException {
		
		System.out.println(date);
		
//		model.addAttribute("result", service.count(date));
		model.addAttribute("result", service.count(date));

		

		return "selectResult";
	}
}
