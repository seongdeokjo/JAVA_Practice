package com.bitcamp.sc.tour.service.impl;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.sc.mail.service.MailService;
import com.bitcamp.sc.tour.domain.TourOrderInfo;
import com.bitcamp.sc.tour.repository.impl.MybatisTourDao;
import com.bitcamp.sc.tour.service.TourService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TourServiceImpl implements TourService {

	private MybatisTourDao dao;

	private MailService mailService;
	

	@Override
	public int selectCount(String date) {
		Date ckDate = Date.valueOf(date);
		return dao.selectCount(ckDate);
	}

	// 투어 주문 정보 가져오기
	public List<TourOrderInfo> getTourOrder(int midx, String category) {
		return dao.getTourOrderByMidx(midx, category);
	}

	// 주문 테이블의 투어 날짜 변경
	@Override
	public boolean changeTourOrder(Map<String, Object> params) {
		boolean changeResult = false;
		int midx = Integer.parseInt((String) params.get("midx"));
		Date resDate = Date.valueOf((String) params.get("resDate"));
		Date newDate = Date.valueOf((String) params.get("newDate"));

		int result = dao.changeDateByMidx(midx, newDate);
		if (result == 1) {
			int result2 = dao.addTourPeople(midx, newDate);
			int result3 = dao.subTourPeople(midx, resDate);
			if(result2 == 1 && result3 == 1) {
				changeResult = true;
			}
		}
		return changeResult;
	}

	// 메일 전송을 위한 메서드 
	@Override
	public boolean sendMailChangeDate(Map<String, Object> params) {
		boolean result = false;
		try {
			mailService.mailSend(params);
			result = true;
		} catch (MessagingException e) {
			result = false;
			e.printStackTrace();
			
		}
		return result;
	}
	
	// String -> Date
	public Date changeToDate(String date) {
		return Date.valueOf(date);
	}

}
