package com.bitcamp.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bitcamp.app.domain.Tour;

@Controller
public class TestController {

	
//	@GetMapping("/t")
//	public String getTest() {
//		return "test";
//	}
//	
//	@GetMapping("/test")
//	public String getForm(@ModelAttribute Tour tour,Model model
//			) {
//		model.addAttribute("tour", tour);
//		System.out.println(tour);
//		return "test2";
//	}
//	
//	@PostMapping("/test2")
//	public String getForm(@ModelAttribute Tour tour,
//			RedirectAttributes redirect
//			) {
//		// 리다이렉트 직전 플래시에 저장하는 메소드다. 리다이렉트 이후에는 소멸한다.
//		tour.setPrice(tour.getPrice()*tour.getCount());
//		redirect.addFlashAttribute("tour", tour);
//		System.out.println(redirect.getFlashAttributes());
//
//		return "redirect:/test3";
//	}
//	
//	
//	@GetMapping("/test3")
//	public String getTest2(Model model) {
//		Tour tour =  (Tour)model.asMap().get("tour");
//		System.out.println(tour);
//		return "test3";
//	}
//	
}
