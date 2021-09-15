package com.bitcamp.sc.tour.repository;

import java.sql.Date;
import java.util.List;

import com.bitcamp.sc.tour.domain.TourOrderInfo;

public interface TourDao {
	// 현재 인원 값을 가져오기
	int selectCount(Date date);
	// 투어 예약 날짜의 투어 번호 가져오기
	int getTidxbyTdate(Date date);
	// 결제 : 투어 날짜로 투어 번호 가져오기
	 
	// 새로운 예약, 예약 변경
	int addTourPeople(int tourPeople,Date newDate);
	// 예약 취소, 예약 변경
	int subTourPeople(int tourPeople,Date currentDate);
	
	
	// 
	int changeDateByMidx(int midx,Date newDate);
	
	List<TourOrderInfo> getTourOrderByMidx(int midx,String category);
	
	
	
	
	
	
}
