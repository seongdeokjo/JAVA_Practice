package com.bitcamp.sc.tour.repository.impl;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class ServiceTest {
	
	
	
	
	@Test
	@Transactional
	@Rollback(true)
	void test_service() {
		
	}
	
	
}
