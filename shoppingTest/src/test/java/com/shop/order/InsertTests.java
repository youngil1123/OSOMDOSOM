package com.shop.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Order;
import com.shop.service.OrderService;



@SpringBootTest
class InsertTests {

	@Autowired
	OrderService service;
	
	@Test
	void contextLoads() {
		Order order = new Order(0, 4, "삼성페이", null);
		try {
			service.register(order);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}