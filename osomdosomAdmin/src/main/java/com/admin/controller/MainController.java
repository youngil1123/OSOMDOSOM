package com.admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.admin.dto.Admin;
import com.admin.service.AdminService;

@Controller
public class MainController {

	@Autowired
	AdminService aservice;

	@RequestMapping("/")
	public String main() {
		return "adminIndex";
	}

	@RequestMapping("/loginimpl")
	public String login(Model model,HttpSession session,String admin_id,String admin_pwd) {
		Admin adm = new Admin();
		adm.setAdmin_id(admin_id);
		adm.setAdmin_pwd(admin_pwd);
		try {
			System.out.println(adm);
			//1.DB에 있는 어드민과 로그인정보가 같은지 확인
			int result = aservice.adminlogin(adm);
			System.out.println(result);
			if(result==1){//로그인성공
				//2.로그인 성공시 세션에 로그인 정보 저장 -> 관리 페이지로 이동
				session.setAttribute("admin", adm);
				return "adminDashBoard";
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		//로그인 실패시
		model.addAttribute("login_fail_msg", "로그인 실패! 다시시도해주세요");
		return "adminIndex";
}
}
