package com.shop.item;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Item;
import com.shop.service.ItemService;

@SpringBootTest
public class itemSelectAll {
	
	@Autowired
	ItemService service;
	@Test
	void contextLoads() {
		List<Item> objs = null;
		try {
			objs = service.get();
			for(Item obj:objs) {
				System.out.println(obj);
			}
			System.out.println("success");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
