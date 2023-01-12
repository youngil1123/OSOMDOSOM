package com.shop.review;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Review;
import com.shop.service.ReviewService;

@SpringBootTest
class reviewItemSelect {

	@Autowired
	ReviewService service;
	@Test
	void contextLoads() {
		List<Review> objs=null;
		try {
			objs=service.searchItemReview(7);
			for(Review obj : objs) {
				System.out.println(obj);
			}
			System.out.println("상품의 리뷰 모두 선택 테스트 성공!");
		} catch (Exception e) {
			System.out.println("상품의 리뷰 모두 선택 실패...");
			e.printStackTrace();
		}
		
	}

}
