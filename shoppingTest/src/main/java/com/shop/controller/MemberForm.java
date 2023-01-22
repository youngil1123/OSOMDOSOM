package com.shop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.shop.dto.Member_tbl;
import com.shop.service.Member_tblService;



public class MemberForm {
	
	private String mem_name;
	private String mem_id;
	private String mem_pwd;
	private String mem_email;
	private String mbti;
	private String nickname;
	
	public String getMem_Name() {
		return mem_name;
	}

	public String getMem_Id() {
		return mem_id;
	}
	public String getMem_Pwd() {
		return mem_pwd;
	}
	
	public String getMem_Email() {
		return mem_email;
	}
	
	public String getMbti() {
		return mbti;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	
	public String getMem_Name(String mem_name) {
		return mem_name=getMem_Name();
	}
	
	
	public void setMem_Id(String mem_id) {
		this.mem_id=getMem_Id();
	}
	
	public void setMem_Pwd(String mem_pwd) {
		this.mem_pwd=getMem_Pwd();
	}
	
	public void setMem_emil(String mem_email) {
		this.mem_pwd=getMem_Email();
	}
	
	public void setMMbti(String mbti) {
		this.mem_pwd=getMbti();
	}
	
	public void setNickname(String nickname) {
		this.mem_pwd=getNickname();
	}
	
}
