package com.shop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shop.dto.Board;
import com.shop.dto.Member_tbl;
import com.shop.service.BoardService;


@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	BoardService boardservice;
	
	@RequestMapping("/myboard")
	public String searchmylist(Model model, HttpSession session) throws Exception{
		List<Board> list = null;
		Member_tbl member = new Member_tbl();
		member = (Member_tbl)session.getAttribute("logincust");
		
		list = boardservice.searchmylist(member.getMem_id());
		
		model.addAttribute("searchmylist", list);
		
		return "/board/myboard";
		
	}
	

}
