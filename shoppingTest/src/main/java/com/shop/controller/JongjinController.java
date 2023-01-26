package com.shop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView follower(HttpServletRequest request) {
		
		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		String myid = session.getId();	//로그인한 아이디
		
		int my_no = mservice.findmem_no(myid); //내 회원번호 
		//내 회원번호가 mem_no 와 일치하는 컬럼들의 mem_no2의 모든 데이터를 리스트로 가져온다.
		
		
		mv.setViewName("follower/follwer");
		
        return mv;
    }
	
	@RequestMapping("/addFollower")
    public String addFollower() {
        return "follower/addFollower";
    }
	

	

	
}
