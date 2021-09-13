package com.bitcamp.sc.tour.controller;

import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitcamp.sc.member.domain.LoginInfo;
import com.bitcamp.sc.tour.service.TourService;
import com.bitcamp.sc.tour.service.impl.TourAuthPhoneNumberService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class TourRestController {

	
	TourService service;

	TourAuthPhoneNumberService authNumberService;

	@GetMapping("/tour/count")
	public int getCount(@RequestParam("mid") String date) {
		System.out.println(date);
		return service.selectCount(date);
	}

	// 예약 변경 확정 버튼 클릭 처리 -> orders테이블 tidx 수정 -> tour 테이블 날짜 각각 인원 수정
	@PostMapping("/tour/changeTour")
	public boolean changeTour(@RequestParam Map<String, Object> params) {
		return	service.changeTourOrder(params);
	}
	
	// 예약 변경 메일 전송
	@PostMapping("/tour/sendMail")
	public boolean sendMailChangeDate(@RequestParam Map<String,Object> params) {
		boolean result = false;

	System.out.println("=========================================================");
	System.out.println(params);
	result = service.sendMailChangeDate(params);
	System.out.println(result);
	
		return result;
	}
	
	// db 휴대전화번호와 일치여부 
	@GetMapping("/verifyMyPhone")
	public String verifyMyPhone(@RequestParam("phone") String ph,HttpServletRequest req) {
		HttpSession session = req.getSession();
		LoginInfo login = (LoginInfo)session.getAttribute("loginInfo");
		String result ="";
		if(login.getPhone().equals(ph)) {
			result = "Y";
			System.out.println("휴대전화 번호 일치");
		}else {
			result = "N";
			System.out.println("휴대전화 번호 불일치");
		}
			
		return result;
	}

	// 휴대전화 인증
	@ResponseBody
	@GetMapping("/sendMessage")
	public String getPhoneNumber(@RequestParam("phone") String ph) {
		
		Random rand = new Random();
		String numStr = "";
		for (int i = 0; i < 6; i++) {
			String ran = Integer.toString(rand.nextInt(10));
			numStr += ran;
		}

		System.out.println("수신자 번호 : " + ph);
		System.out.println("인증번호 : " + numStr);
		authNumberService.authNumberByPhone(ph, numStr);

		return numStr;

	}

}
