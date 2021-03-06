package com.bitcamp.sc.shop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitcamp.sc.cart.domain.GoodsToCart;
import com.bitcamp.sc.shop.service.ShopService;

@Controller
public class ShopController {

//	@Autowired
//	ShopService service;
	
	// shop메인 페이지
	@RequestMapping(value="/shop", method = RequestMethod.GET)
	public String getShop() {
		return "shop/shopMain";
	}
	
	// 상품 상세페이지
	@RequestMapping(value="/shop/{idx}", method = RequestMethod.GET)
	public String getShopDesc(@PathVariable("idx") int idx) {
		return "shop/product"+idx;
	
		
	}
	
	
	 // BuyNow 페이지로 가기
	 // @RequestParam("name 이름") 타입지정 변수명
	
	@RequestMapping(value="/shop/shop_payment", method = RequestMethod.GET)
	public String getBuyNow(	
			
			@RequestParam("gphotoname") String gphotoname,
			@RequestParam("gname") String gname,
			@RequestParam("gidx") int gidx,
			@RequestParam("gprice") int gprice,
			@RequestParam("amount") int amount,
			
			Model model
			) {
			
			model.addAttribute("gphotoname", gphotoname);
			model.addAttribute("gname", gname);
			model.addAttribute("gidx", gidx);
			model.addAttribute("gprice",gprice);
			model.addAttribute("amount", amount);
			
			System.out.println("입력한 gname : " + gname);
			System.out.println("입력한 idx : " + gidx);
			System.out.println("입력한 gprice : " + gprice);
			System.out.println("입력한 amount : " + amount);
			
			return "shop/shop_payment";
		
	}

	
	
}
