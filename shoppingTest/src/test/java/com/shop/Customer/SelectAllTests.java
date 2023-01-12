package com.shop.Customer;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Customer;
import com.shop.service.CustomerService;

@SpringBootTest
class SelectAllTests {
	
	@Autowired
	CustomerService service;

    @Test
    void contextLoads() {
    	List<Customer> custs = null;
        try {
            custs = service.get();
            for(Customer c:custs) {
            	System.out.println(c);
            }
            System.out.println("OK");
        } catch (Exception e) {
            System.out.println("fail");
            e.printStackTrace();
        }
    }
}
