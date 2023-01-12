package com.shop.categories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Categories;
import com.shop.service.CategoriesService;

@SpringBootTest
public class categoriesInsert {
	
	@Autowired
	CategoriesService service;
	@Test
	void contextLoads() {
		Categories objs = new Categories(304,"주방용품",4);
		try {
			service.register(objs);
			System.out.println("success");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
