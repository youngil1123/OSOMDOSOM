package com.shop.ship;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Ship;
import com.shop.service.ShipService;

@SpringBootTest
public class SelectTest {
	@Autowired
	ShipService service;

	@Test
	void contextLoads() {
		Ship obj = null;
		try {
			obj=service.get(3);
			System.out.println(obj);
			System.out.println("성공!");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
			//
		}
	}
}
