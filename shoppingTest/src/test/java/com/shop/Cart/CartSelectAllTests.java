package com.shop.Cart;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Cart;
import com.shop.service.CustomerService;

@SpringBootTest
class CartSelectAllTests {
	
	@Autowired
    CustomerService service;

    @Test
    void contextLoads() {
    	List<Cart> objs = null;
        try {
            objs = service.myCart(4);
            for(Cart c:objs) {
            	System.out.println(c);
            }
            System.out.println("OK");
        } catch (Exception e) {
            System.out.println("fail");
            e.printStackTrace();
        }
    }
}
