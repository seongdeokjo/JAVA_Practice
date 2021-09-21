package com.bitcamp.sc.tour.repository;

import java.util.List;

import com.bitcamp.sc.tour.domain.TourOrderInfo;

public interface TourDao {
	// 현재 인원 값을 가져오기
	int selectCount(String date);
	// 투어 예약 날짜의 투어 번호 가져오기
	int getTidxbyTdate(String date);
	// 결제 : 투어 날짜로 투어 번호 가져오기
	 
	// 새로운 예약, 예약 변경
	int addTourPeople(int tourPeople,String newDate);
	// 예약 취소, 예약 변경
	int subTourPeople(int tourPeople,String currentDate);
	
	
	// 
	int changeDateByMidx(int midx,String newDate);
	
	int modifyTour(int tourPeople, String newDate, String resDate);
	List<TourOrderInfo> getTourOrderByMidx(int midx,String category);
	String getTourDateByTidx(int tidx);
	
	
	
	
	
	
}
