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
	public String loginimpl(HttpSession session, String mem_id, String mem_pwd, Model model) {
		Member_tbl member = null;
		String result = "loginfail";
		try {
			member = mservice.get(mem_id);
			if (member != null) {
			if(member.getMem_pwd().equals(mem_pwd)) {
					// 성공
					// 성공시에만 이걸로 바뀜. 디폴트는 로그인 fail.
					session.setAttribute("logincust", member);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	};
	
	@RequestMapping("/logout")
	public String logout(HttpSession session, Model model) {
		session.invalidate();
		model.addAttribute("session", session);
		return "index";
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
	
	
	@RequestMapping("/lostinfo")
	 public String lostinfo(){
		 return "lostinfo";
	 }
	 
}
