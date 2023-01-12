package com.shop.categories;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Categories;
import com.shop.service.CategoriesService;

@SpringBootTest
public class categoriesSelectAll {
	
	@Autowired
	CategoriesService service;
	@Test
	void contextLoads() {
		List<Categories> objs = null;
		try {
			objs = service.get();
			for(Categories obj:objs) {
				System.out.println(obj);
			}
			System.out.println("success");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
