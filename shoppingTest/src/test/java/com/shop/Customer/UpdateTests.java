package com.shop.Customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Customer;
import com.shop.service.CustomerService;

@SpringBootTest
class UpdateTests {
	@Autowired
	CustomerService service;

    @Test
    void contextLoads() {
    	Customer cust = new Customer();
        try {
            service.modify(cust);
            System.out.println("OK");
        } catch (Exception e) {
            System.out.println("fail");
            //e.printStackTrace();
        }
    }
}
