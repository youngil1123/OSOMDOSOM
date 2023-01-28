package com.shop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.dto.BookInfo;
import com.shop.mapper.BookMapper;
import com.shop.service.BookService;
import com.shop.service.ContentsService;
import com.shop.service.MovieService;
import com.shop.service.TheaterService;

@Controller
public class SearchController {
	
	@Autowired
	private BookMapper bookmapper;
	
	@Autowired
	BookService bookService;
	
	@Autowired
	ContentsService contentsService;
	
	@Autowired
	MovieService movieService;
	
	@Autowired
	TheaterService theaterService;
	
	
	
	
	
	@RequestMapping("/boardwrite")
    public String boardwrite(Model model) {
		
		model.addAttribute("top", "boardwrite");
        return "/board/boardwrite";
	}
	
	//새 글 작성  페이지
		@RequestMapping(value="/newboardwrite")
	    public String newboardwrite(Model model) throws Exception {
			
			model.addAttribute("top", "newboardwrite");
	        return "/board/newboardwrite";
		}
		
		
		@RequestMapping(value="/searchbooklist")
		@ResponseBody
	    public List<BookInfo> searchbooklist(String keyword, Model model) throws Exception {
			
			List<BookInfo> objs = bookmapper.searchbooklist(keyword);
			model.addAttribute("objs", "objs");
	        return objs;
	    }
}
