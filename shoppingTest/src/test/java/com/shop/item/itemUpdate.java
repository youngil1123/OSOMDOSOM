package com.shop.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Item;
import com.shop.service.ItemService;

@SpringBootTest
public class itemUpdate {
	
	@Autowired
	ItemService service;
	@Test
	void contextLoads() {
		Item objs = new Item(3,102,"유니클로후리스",66000);
		try {
			service.modify(objs);
			System.out.println("success");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
