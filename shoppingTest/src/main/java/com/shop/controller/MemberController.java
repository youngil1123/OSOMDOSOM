package com.shop.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.dto.Mail;
import com.shop.dto.Member_tbl;
import com.shop.frame.CryptoUtil;
import com.shop.service.BoardService;
import com.shop.service.Member_tblService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	BoardService bservice;
	
	@Autowired
	Member_tblService mservice;
	
	

	//회원가입완료 클릭 후 넘어가는 페이지
	@GetMapping("/btn") 
	public String loginForm() {
		return"login";
	}
	
	
	//회원가입 데이터 연동
	@PostMapping("/new")
	public String create(Member_tbl member_tbl) throws Exception{
		//post로 넘어온 input 데이터를 매게변수로 입력한 MemberForm에 있는 id에 자동으로 setName 이 됨
		//비밀번호 암호화
		String plainpwd=member_tbl.getMem_pwd();
		String key = "osomdosompasswd0077";
		String encryptpwd = CryptoUtil.encryptAES256(plainpwd, key);
		System.out.println("AES 256 방식 암호화 : " + encryptpwd);
		
	Member_tbl member= new Member_tbl(); 
		member.setMem_name(member_tbl.getMem_name());
		member.setMem_id(member_tbl.getMem_id());
		member.setMem_pwd(encryptpwd);
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

		// 이메일 보내기
		@Transactional
		@PostMapping("/sendEmail")
		public String sendEmail(@RequestParam("mem_email") String mem_email) {
			Mail dto = mservice.createMailAndChangePassword(mem_email);
			mservice.mailSend(dto);

			return "/login";
	}

	}
