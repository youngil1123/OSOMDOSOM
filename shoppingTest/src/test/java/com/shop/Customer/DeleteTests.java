package com.shop.Customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.service.CustomerService;

@SpringBootTest
class DeleteTests {
	
	@Autowired
    CustomerService service;

    @Test
    void contextLoads() {
        try {
            service.remove("id001");
            System.out.println("OK");
        } catch (Exception e) {
            System.out.println("fail");
            //e.printStackTrace();
        }
    }
}
