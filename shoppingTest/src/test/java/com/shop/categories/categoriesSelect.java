package com.shop.categories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Categories;
import com.shop.service.CategoriesService;

@SpringBootTest
public class categoriesSelect {
	
	@Autowired
	CategoriesService service;
	@Test
	void contextLoads() {
		Categories objs = null;
		try {
			objs = service.get(303);
			System.out.println(objs);
			System.out.println("success");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
