package com.shop.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.dto.Member_tbl;
import com.shop.service.Member_tblService;

@Controller
public class MainController {
	
	@Autowired
	Member_tblService mservice;
	
	@RequestMapping("/")
    public String main() {
        return "index";
    }
	
	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("top", "login");
		return "login";
	}
	@RequestMapping("/loginimpl")
	public String loginimpl(String mem_id, String mem_pwd, Model model,HttpSession session) {
		Member_tbl member = null;
		String result = "로그인 실패";
		try {
			member = mservice.get(mem_id);
			if(member.getMem_pwd().equals(mem_pwd)) {
				session.setAttribute("member", member);
				return "index";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
	
	@RequestMapping("/register")
	public String register(Model model) {
		model.addAttribute("top", "register");
		return "register";
	}
	
	@RequestMapping("/about")
    public String about() {
        return "about";
    }
	
	
	
}
