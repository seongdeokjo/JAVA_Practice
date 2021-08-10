package com.test.example1.controller;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/select")
public class SelectController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String getSelectForm() {
		return "selectForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String result(
			HttpServletRequest request,
			Model model
			) throws ParseException {
		String id = request.getParameter("id");
		String select = request.getParameter("selectTime");
		String selectGroup = request.getParameter("selectGroup");
		String date =  request.getParameter("date");
		
		model.addAttribute("id", id);
		model.addAttribute("select", select);
		model.addAttribute("selectGroup", selectGroup);
		model.addAttribute("date", date);	
		
// sql date 타입 형 변환 string to date		
	String time	= date;
	Date d = Date.valueOf(time);
	
//	        Timestamp timestamp = Timestamp.valueOf(time);
	        System.out.println(d);
	        System.out.println(d);
			
		return "selectResult";
	}
}
