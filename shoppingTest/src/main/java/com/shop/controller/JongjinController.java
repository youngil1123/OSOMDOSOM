package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.dto.Member_tbl;
import com.shop.service.Member_tblService;

@Controller
public class JongjinController {
	
	@Autowired
	Member_tblService mservice;
	
	@RequestMapping("/follower")
    public String follower() {
        return "follower/follower";
    }
	
	@RequestMapping("/follower/addFollower")
    public String addFollower() {
        return "follower/addFollower";
    }
	
}
