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
	
	
	@Override
	public void saveBasket(BasketDto bDto) {
		int result =bDao.createBasket(bDto);
		if(result == 1) {
			logger.info("장바구니 생성 완료");
		}
		
		
	}


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


	@Override
	public int getDeleteRowByGidx(int gidx,int midx) {

		
		return 	bDao.deleteRowByGidx(gidx,midx);
	}


	@Override
	public void deleteAllByMidx(int midx) {
			bDao.deleteAll(midx);
	}

}
