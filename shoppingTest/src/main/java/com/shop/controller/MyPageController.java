package com.shop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shop.dto.Member_tbl;
import com.shop.service.FriendshipService;
import com.shop.service.Member_tblService;

@Controller
@RequestMapping("/mypage")
public class MyPageController {

	@Autowired
	Member_tblService mservice;

	@Autowired
	FriendshipService fservice;

	@RequestMapping("")
	public ModelAndView mypage(HttpServletRequest request) {

		HttpSession session = request.getSession();
		ModelAndView mv = new ModelAndView();

		Member_tbl myinfo = (Member_tbl) session.getAttribute("logincust"); // 로그인한 내 정보들

		mv.setViewName("/mypage/mypage");
		mv.addObject("myinfo", myinfo);
		return mv;
	}
}
