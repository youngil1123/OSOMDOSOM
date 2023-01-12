package com.shop.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Item;
import com.shop.service.ItemService;

@SpringBootTest
public class itemSelect {
	
	@Autowired
	ItemService service;
	@Test
	void contextLoads() {
		Item objs = null;
		try {
			objs = service.get(6);
			System.out.println(objs);
			System.out.println("success");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
