package com.shop.ship;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Ship;
import com.shop.service.ShipService;

@SpringBootTest
public class UpdateTest {
	@Autowired
	ShipService service;

	@Test
	void contextLoads() {
		Ship obj = new Ship("아이유", "서울시 영등포구", "010-1234-1234",5);
		try {
			service.modify(obj);
			System.out.println("성공!");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
			//
		}
	}
}
