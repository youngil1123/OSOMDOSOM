package com.shop;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.BookInfo;
import com.shop.dto.TheaterInfo;
import com.shop.service.BookService;
import com.shop.service.TheaterService;



@SpringBootTest
class searchtheaterTests {

    @Autowired
    TheaterService service;

    @Test
    void contextLoads() {
    	List<TheaterInfo> objs = new ArrayList<TheaterInfo>();
    	try {
			objs = service.searchtheaterlist("연극","수상한");
			for(TheaterInfo obj : objs) {
				System.out.println(obj);
			}
			objs = service.searchtheaterlist("뮤지컬", "시카고");
			for(TheaterInfo obj : objs) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
    }

}