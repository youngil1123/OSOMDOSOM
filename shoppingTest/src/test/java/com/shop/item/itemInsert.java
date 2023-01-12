package com.shop.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Item;
import com.shop.service.ItemService;

@SpringBootTest
public class itemInsert {
	
	@Autowired
	ItemService service;
	@Test
	void contextLoads() {
		Item objs = new Item(0,301,"냄비",34000,null,null);
		try {
			service.register(objs);
			System.out.println("success");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
