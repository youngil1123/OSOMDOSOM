package com.shop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

//github.com/youngil1123/OSOMDOSOM.git
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.dto.Board;
import com.shop.dto.Member_tbl;
import com.shop.service.BoardService;


@Controller
public class BoardController {

	@Autowired
	BoardService boardservice;
	
	@RequestMapping("/myboard")
	public String searchmylist(Model model,  HttpSession session) throws Exception{
		List<Board> list = null;
		Member_tbl member = new Member_tbl();
		member = (Member_tbl)session.getAttribute("logincust");

	
		if(member != null) {
				int mem_no = member.getMem_no();
				list = boardservice.searchmylist(mem_no);
		}
		
		model.addAttribute("searchmylist", list);
		model.addAttribute("list", list);

		return "board/myboard";	
	}
	

	@RequestMapping("/moviedetail")
  public String moviedetail(Model model, HttpSession session) {
		List<Board> list = null;
		Member_tbl member = new Member_tbl();
		member = (Member_tbl)session.getAttribute("logincust");
		if(member != null) {
			int mem_no = member.getMem_no();
			try {
				list = boardservice.searchmylist(mem_no);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	model.addAttribute("top", "moviedetail");
	model.addAttribute("searchmylist", list);
	model.addAttribute("list", list);
	
      return "/board/moviedetail";
	}
	
}
	

