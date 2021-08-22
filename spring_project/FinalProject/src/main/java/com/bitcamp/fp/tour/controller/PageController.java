package com.bitcamp.fp.tour.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {
		// 날짜 예약 페이지
		@RequestMapping(value="/reservation",method = RequestMethod.GET)
		public String getReserve() {
			return "reservation/selectForm";
		}
	
}
