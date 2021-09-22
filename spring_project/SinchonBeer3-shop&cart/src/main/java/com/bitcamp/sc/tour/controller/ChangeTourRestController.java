package com.bitcamp.sc.tour.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitcamp.sc.tour.domain.ChangeTourDto;
import com.bitcamp.sc.tour.service.ChangeReservationService;

@RestController
public class ChangeTourRestController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private ChangeReservationService changeTourService;
	
	// 예약 변경 확정 버튼 클릭 처리 -> orders테이블 tidx 수정 -> tour 테이블 날짜 각각 인원 수정
	@PutMapping("/tour/changeTour")
	public boolean changeTour(@RequestBody ChangeTourDto changeDto) {
		
		boolean result = false;
		logger.info(changeDto.toString());
		return changeTourService.changeTourOrder(changeDto) == true ? true : result ;
	}
}
