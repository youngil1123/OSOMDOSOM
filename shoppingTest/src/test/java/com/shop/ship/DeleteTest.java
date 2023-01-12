package com.shop.ship;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Ship;
import com.shop.service.ShipService;

@SpringBootTest
public class DeleteTest {
	@Autowired
	ShipService service;

	@Test
	void contextLoads() {
		try {
			service.remove(4);
			System.out.println("성공!");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
			//
		}
	}
}
