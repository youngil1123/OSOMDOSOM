package com.shop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.dto.Friendship;
import com.shop.dto.Member_tbl;
import com.shop.service.FriendshipService;
import com.shop.service.Member_tblService;


@Controller
@RequestMapping("/follower")
public class JongjinController {
	
	@Autowired
	Member_tblService mservice;
	
	@Autowired
	FriendshipService fservice;
	
	@RequestMapping("")
    public String follower() {
        return "follower/follower";
    }
	
	@RequestMapping("/addFollower")
    public String addFollower() {
        return "follower/addFollower";
    }
	
	@RequestMapping("/checkFollower")
    public String checkFollower() {
        return "follower/checkFollower";
    }
	

	
}
