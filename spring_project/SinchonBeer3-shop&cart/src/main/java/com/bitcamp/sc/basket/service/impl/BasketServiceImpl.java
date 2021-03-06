package com.bitcamp.sc.basket.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.sc.basket.domain.BasketDto;
import com.bitcamp.sc.basket.domain.BasketVo;
import com.bitcamp.sc.basket.repository.BasketDao;
import com.bitcamp.sc.basket.service.BasketService;

@Service
public class BasketServiceImpl implements BasketService {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private BasketDao bDao;
	
	@Autowired
	public BasketServiceImpl(BasketDao bDao) {
		this.bDao = bDao;
	}

	
	// 장바구니 생성
	@Override
	public void saveBasket(BasketDto bDto) {
		int avaiableBasket = bDao.checkBasket(bDto.getGidx(), bDto.getMidx());
		logger.info("체크 결과 : "+avaiableBasket);
		if(avaiableBasket > 0) {
			logger.info("이미 장바구니에 값이 존재합니다.");
			bDao.modifyAmount(bDto);
		}else {
			logger.info("생성된 장바구니가 존재하지 않습니다.");
			if(	bDao.createBasket(bDto) == 1) {
				logger.info("장바구니 생성 완료");
			}
		}
			
		
		
	}

	// 장바구니 리스트 가져오기
	@Override
	public List<BasketVo> getList(int midx) {
		List<BasketVo> list = new ArrayList<>();
		if(midx != 0) {
			 list = bDao.getBasketList(midx);
			 if(list.isEmpty()) {
				 logger.info("장바구니 목록이 없습니다.");
			 }			 
		}
		logger.info("장바구니 조회 완료");
		return list;
	}

	// 장바구니 총액 가져오기
	@Override
	public int getTotalPayByMidx(int midx) {
		
		return bDao.getTotalPay(midx);  
			
		
	}

	// 장바구니 한 행만 삭제
	@Override
	public int getDeleteRowByGidx(int gidx,int midx) {

		
		return 	bDao.deleteRowByGidx(gidx,midx);
	}
	
	// 장바구니 선택한 품목 삭제
	@Override
	public int getDeleteRowByGidx(List<Integer> gidxList, int midx) {
		int result = 0;
		for(int i = 0; i < gidxList.size(); i++) {
			result += bDao.deleteRowByGidx((int)gidxList.get(i), midx);
			logger.info("gidx반복 횟수"+i);
		}
		logger.info("result 값"+result);
		return result;
	}

	// 장바구니 모두 삭제
	@Override
	public void deleteAllByMidx(int midx) {
			bDao.deleteAll(midx);
	}
	
	// 장바구니 페이지에서 수량 변경
	@Override
	public int changeBasketAmount(BasketDto bDto) {
		
		
		return bDao.changeBasketAmount(bDto);
	}


	

}
