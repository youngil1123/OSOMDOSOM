package com.shop.review;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Review;
import com.shop.service.ReviewService;

@SpringBootTest
class reviewInsert {

	@Autowired
	ReviewService service;
	@Test
	void contextLoads() {
		
		Review obj = new Review(1, 7,"소고기 맛있네요 .. 굿");
		try {
			service.register(obj);
			System.out.println("리뷰 등록 테스트 성공!");
		} catch (Exception e) {
			System.out.println("리뷰 등록 실패...");
			e.printStackTrace();
		}
		
	}

}
