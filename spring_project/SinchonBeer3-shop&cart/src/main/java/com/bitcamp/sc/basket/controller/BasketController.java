package com.bitcamp.sc.basket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basket")
public class BasketController {
	
	@RequestMapping("/basket")
	public String getBasketPage() {
		
		return "/basket";
	}
}
