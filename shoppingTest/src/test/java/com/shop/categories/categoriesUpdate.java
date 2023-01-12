package com.shop.categories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Categories;
import com.shop.service.CategoriesService;

@SpringBootTest
public class categoriesUpdate {
	
	@Autowired
	CategoriesService service;
	@Test
	void contextLoads() {
		Categories objs = new Categories(304,"생활용품",5);
		try {
			service.modify(objs);
			System.out.println("success");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
