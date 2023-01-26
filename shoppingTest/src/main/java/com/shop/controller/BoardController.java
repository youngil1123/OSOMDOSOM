package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shop.dto.Board;
import com.shop.service.BoardService;


@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	BoardService boardservice;
	
	@RequestMapping(value="/myboard", method=RequestMethod.GET)
	public void list(Model model) throws Exception{
		List<Board> list = null;
		list = boardservice.list();
		
		model.addAttribute("list", list);
		
	}
	

}
