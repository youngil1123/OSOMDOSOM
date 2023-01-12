package com.shop.review;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Review;
import com.shop.service.ReviewService;

@SpringBootTest
class reviewSelect {

	@Autowired
	ReviewService service;
	@Test
	void contextLoads() {
		Review obj = null;
		try {
			obj=service.get(2);
			System.out.println(obj);
			System.out.println("리뷰하나 선택 테스트 성공!");
		} catch (Exception e) {
			System.out.println("리뷰하나 선택 실패...");
			e.printStackTrace();
		}
		
	}

}
