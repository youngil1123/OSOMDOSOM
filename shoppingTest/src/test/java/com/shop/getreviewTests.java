package com.shop;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.BookInfo;
import com.shop.service.BookService;



@SpringBootTest
class getreviewTests {

	@Autowired
	BookService service;
	@Test
    void contextLoads() {
    	List<BookInfo> objs = new ArrayList<BookInfo>();
    	try {
			objs = service.getbookreview();
			for(BookInfo obj : objs) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
    }
	
}