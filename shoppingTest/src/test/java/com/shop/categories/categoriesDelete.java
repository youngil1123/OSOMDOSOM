package com.shop.categories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.service.CategoriesService;

@SpringBootTest
public class categoriesDelete {
	
	@Autowired
	CategoriesService service;
	@Test
	void contextLoads() {
		try {
			service.remove(303);
			System.out.println("success");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
