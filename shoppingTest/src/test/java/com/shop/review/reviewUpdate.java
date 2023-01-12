package com.shop.review;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Review;
import com.shop.service.ReviewService;

@SpringBootTest
class reviewUpdate {

	@Autowired
	ReviewService service;
	@Test
	void contextLoads() {
		Review obj = new Review(4,"4번 리뷰 수정중..");
		try {
			service.modify(obj);
			System.out.println("리뷰 수정 테스트 성공!");
		} catch (Exception e) {
			System.out.println("리뷰 수정 실패...");
			//e.printStackTrace();
		}
		
	}

}
