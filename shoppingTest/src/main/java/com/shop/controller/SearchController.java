package com.shop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.dto.BookInfo;
import com.shop.dto.MovieInfo;
import com.shop.dto.TheaterInfo;
import com.shop.mapper.BookMapper;
import com.shop.mapper.MovieMapper;
import com.shop.mapper.TheaterMapper;
import com.shop.service.BookService;
import com.shop.service.ContentsService;
import com.shop.service.MovieService;
import com.shop.service.TheaterService;

@Controller
public class SearchController {

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

	// 새 글 작성 페이지
	@RequestMapping(value = "/newboardwrite")
	public String newboardwrite(Model model, String keyword, String searchType) throws Exception {

		model.addAttribute("top", "newboardwrite");
		System.out.println("새글페이지" + searchType + " " + keyword);
		
		if (keyword == null)
			return "/board/newboardwrite";

		if(searchType.equals("movie")) {
		 	//영화
             List<MovieInfo> movies = new ArrayList<MovieInfo>();
             movies = movieService.searchmovielist(keyword);       
             model.addAttribute("objsmovies", movies);
             
          
		}else if(searchType.equals("book")){
             //책
             List<BookInfo> books = new ArrayList<BookInfo>();
             books = bookService.searchbooklist(keyword);          
             model.addAttribute("objsbooks", books);
           
		}else if(searchType.equals("theater"))    { 
             //뮤지컬, 연극
             List<TheaterInfo> theater = new ArrayList<TheaterInfo>();            
             theater = theaterService.searchtheaterlist(keyword);
             model.addAttribute("objstheaters", theater);
             
	}
	

		return "/board/newboardwrite";
	}

}
