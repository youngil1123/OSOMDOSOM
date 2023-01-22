package com.shop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Member_tbl;
import com.shop.service.Member_tblService;



@SpringBootTest
class CreateMemberTests {

    @Autowired
    Member_tblService service;

    @Test
    void contextLoads() {

        Member_tbl obj = new Member_tbl("다솜","dasom","111111","chungwoon83@naver.com","infj","다토리");

        try {
            service.register(obj);
            System.out.println("OK");
        } catch (Exception e) {
            System.out.println("FAILED");
            e.printStackTrace();
        }
    }

}