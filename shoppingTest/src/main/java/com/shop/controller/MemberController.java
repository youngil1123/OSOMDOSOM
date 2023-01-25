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

public class MemberController {
	
	
	
	@Autowired
	Member_tblService mservice;
		
	//회원가입완료 클릭 후 넘어가는 페이지
	@GetMapping("/member/new") 
	public String loginForm() {
		return"login";
	}
	
	
	//회원가입 데이터 연동
	@PostMapping("/member/new")
	public String create(MemberForm form) {
		//post로 넘어온 input 데이터를 매게변수로 입력한 MemberForm에 있는 id에 자동으로 setName 이 됨
	Member_tbl member= new Member_tbl(); 
		member.setMem_name(form.getMem_Name());
		member.setMem_id(form.getMem_Id());
		member.setMem_pwd(form.getMem_Pwd());
		member.setMem_email(form.getMem_Email());
		member.setMbti(form.getMbti());
		member.setNickname(form.getNickname());
	    mservice.join(member);
		return "login";
	}
	
	
	//비밀번호찾기 페이지 이동
	@RequestMapping("/lostinfo")
	 public String lostinfo(){
		 return "lostinfo";
	 }
	 

}
