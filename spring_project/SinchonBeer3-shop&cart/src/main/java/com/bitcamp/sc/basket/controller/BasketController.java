package com.bitcamp.sc.basket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/basket")
public class BasketController {
	
	@RequestMapping(value = "/basket",method = RequestMethod.POST )
	public String getBasketPage() {
		
		return "/basket";
	}
}
