package com.shop.ship;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Ship;
import com.shop.service.ShipService;

@SpringBootTest
public class InsertTest {
	@Autowired
	ShipService service;

	@Test
	void contextLoads() {
		Ship obj = new Ship(0,3,"아이유","서울시 서초구","010-1111-2222");
		try {
			service.register(obj);
			System.out.println("성공!");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
			//
		}
	}
}
