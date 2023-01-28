package com.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Board;
import com.shop.service.BoardService;



@SpringBootTest
class BoardTests {

	@Autowired
	BoardService service;
	
}