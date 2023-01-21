package com.shop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.shop.dto.Member_tbl;
import com.shop.service.Member_tblService;

@Controller

public class MemberController {
	
	@Autowired
	Member_tblService mservice;
		
	
	 @RequestMapping("/lostinfo")
	 public String lostinfo(){
		 return "lostinfo";
	 }
	 
	
	
}
