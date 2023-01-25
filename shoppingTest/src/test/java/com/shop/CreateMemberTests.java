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

        Member_tbl obj = new Member_tbl("박하","mint","111111","moa8417@naver.com","enft","깜찍이");

        try {
            service.register(obj);
            System.out.println("OK");
        } catch (Exception e) {
            System.out.println("FAILED");
            e.printStackTrace();
        }
    }

}