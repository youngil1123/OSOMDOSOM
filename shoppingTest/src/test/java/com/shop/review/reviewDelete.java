package com.shop.review;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Review;
import com.shop.service.ReviewService;

@SpringBootTest
class reviewDelete {

	@Autowired
	ReviewService service;
	@Test
	void contextLoads() {
		try {
			service.remove(2);
			System.out.println("리뷰 삭제 테스트 성공!");
		} catch (Exception e) {
			System.out.println("리뷰 삭제 실패...");
			//e.printStackTrace();
		}
		
	}

}
