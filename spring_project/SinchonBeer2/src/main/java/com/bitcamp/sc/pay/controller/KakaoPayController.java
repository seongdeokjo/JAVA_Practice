package com.bitcamp.sc.pay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitcamp.sc.order.domain.OrderInfo;
import com.bitcamp.sc.order.service.OrderService;
import com.bitcamp.sc.pay.domain.KakaoPayApproval;
import com.bitcamp.sc.pay.domain.PayInfo;
import com.bitcamp.sc.pay.service.impl.PayServiceImpl;
import com.bitcamp.sc.pay.service.impl.type.KakaoPay;

@Controller
public class KakaoPayController {

	private KakaoPay kakaoPay;
	private PayServiceImpl payService;
	private OrderService orderService;
	
	@Autowired
	public KakaoPayController(KakaoPay kakaoPay, PayServiceImpl payService, OrderService orderService) {
		this.kakaoPay = kakaoPay;
		this.payService = payService;
		this.orderService = orderService;
	}
	
	@GetMapping("/kakaoPay")
	public String kakaoPayGet() {
		return "pay/kakaoPay";
	}
	
	@PostMapping("/kakaoPay")
	public String kakaoPayPost() {
		return "redirect:" + kakaoPay.kakaoPayReady();
	}
	
	@GetMapping("/kakaoPaySuccess")
	public String kakaoPaySuccess(@RequestParam("pg_token") String pg_token, Model model) {
		KakaoPayApproval kakaoPayApproval = kakaoPay.kakaoPayInfo(pg_token);
		PayInfo payInfo = payService.approvalToPayInfo(kakaoPayApproval);
		payService.savePayment(payInfo);
		
		System.out.println(payInfo);
		model.addAttribute("payIdx", payInfo.getIdx());
		
		return "pay/kakaoPaySuccess";
	}
	
	@GetMapping("/kakaoPayComplete")
	public String kakaoPayComplete(@RequestParam("payIdx") String payIdx, Model model) {
		model.addAttribute("payIdx", payIdx);
		return "pay/kakaoPayComplete";
	}
	
	@GetMapping("/paySuccess")
	public String paySuccess(@RequestParam(value = "payIdx", required = false) String payIdx, Model model) {
		PayInfo payInfo = payService.getPayInfo(Integer.parseInt(payIdx));
		OrderInfo orderInfo = orderService.getOrderInfo(payInfo.getOrderIdx());
		
		model.addAttribute("payInfo", payInfo);
		model.addAttribute("orderInfo", orderInfo);
		
		return "pay/paySuccess";
	}
}
