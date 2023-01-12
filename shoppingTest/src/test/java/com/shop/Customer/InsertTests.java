package com.shop.Customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Customer;
import com.shop.service.CustomerService;

@SpringBootTest
class InsertTests {
	
	@Autowired
	CustomerService service;

    @Test
    void contextLoads() {
    	Customer cust = new Customer(4,"이영지","id004", "pwd004", "010-9999-9999","youngji@gmail.com",null);
        try {
            service.register(cust);
            System.out.println("OK");
        } catch (Exception e) {
            System.out.println("fail");
            //e.printStackTrace();
        }
    }
}
