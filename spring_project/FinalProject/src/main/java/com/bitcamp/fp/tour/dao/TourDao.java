package com.bitcamp.fp.tour.dao;

import java.sql.Date;

public interface TourDao {
	// select : 현재 인원 값 가져오기 
	int selectCount(Date date);
	// update : 결제 완료 -> 현재인원 값 증가 or 예약 변경시
	int addCount(int count,Date date);
	// update : 결제 취소 -> 현재인원 값 감소 or 예약 변경시
	int substractCount(int count,Date date);
}
