package com.shop.ship;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Ship;
import com.shop.service.ShipService;

@SpringBootTest
public class SelectAllTest {
	@Autowired
	ShipService service;

	@Test
	void contextLoads() {
		List<Ship> obj = null;
		try {
			obj=service.get();
			for(Ship s:obj) {
				System.out.println(s);
			}
			System.out.println("성공!");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
			//
		}
	}
}
