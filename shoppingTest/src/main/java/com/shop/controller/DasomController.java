package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.dto.Member_tbl;
import com.shop.service.Member_tblService;

@Controller
public class DasomController {
	
	@Autowired
	Member_tblService mservice;
	
	@RequestMapping("/find_pwd")
    public String find_pwd() {
		
        return "find_pwd";
    }
	
}
