package com.shop.controller;


import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.shop.dto.Member_tbl;
import com.shop.service.Member_tblService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	
	
	@Autowired
	Member_tblService mservice;
	
	
	
	//회원가입완료 클릭 후 넘어가는 페이지
	@GetMapping("/btn") 
	public String loginForm() {
		return"login";
	}
	
	
	//회원가입 데이터 연동
	@PostMapping("/new")
	public String create(Member_tbl member_tbl) {
		//post로 넘어온 input 데이터를 매게변수로 입력한 MemberForm에 있는 id에 자동으로 setName 이 됨
	Member_tbl member= new Member_tbl(); 
		member.setMem_name(member_tbl.getMem_name());
		member.setMem_id(member_tbl.getMem_id());
		member.setMem_pwd(member_tbl.getMem_pwd());
		member.setMem_email(member_tbl.getMem_email());
		member.setMbti(member_tbl.getMbti());
		member.setNickname(member_tbl.getNickname());
	    try {
			mservice.register(member);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "login";
	}
	
	
	//비밀번호찾기 페이지 이동
	@RequestMapping("/lostinfo")
	 public String lostinfo(){
		 return "lostinfo";
	 }
	 

}
