package com.shop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.dto.BookInfo;
import com.shop.service.BookService;
import com.shop.service.TheaterService;


@Controller
public class MediaController {
	
	@Autowired
	TheaterService theaterService;

	@Autowired
	BookService service;


	@RequestMapping("/mediamain")
    public String mediamain(Model model) {
		
		model.addAttribute("top", "mediamain");
        return "/board/mediamain";
    }
	@RequestMapping("/moviedetail")
    public String moviedetail(Model model) {
		
		model.addAttribute("top", "moviedetail");
        return "/board/moviedetail";
	}

	

	@RequestMapping("/movie")
    public String movie(Model model) {
		
		model.addAttribute("top", "movie");
        return "/board/movie";
    }

	@RequestMapping("/musical")
    public String musical(Model model) {
		
		model.addAttribute("top", "musical");
        return "/board/musical";
    }
	@RequestMapping("/book")
    public String book(Model model) {
		List<BookInfo> objs = new ArrayList<BookInfo>();
		try {
			objs = service.getbookreview();
			model.addAttribute("reviews", objs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("top", "book");
        return "/board/book";
    }
	
	
	@RequestMapping("/theater")
    public String getposter(Model model, String poster) {
		
		List<String> theater = new ArrayList<String>();
		
		try {
			theater = theaterService.getposter(poster);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		model.addAttribute("objstheaters", theater);
		
		model.addAttribute("top", "theater");
        return "/board/theater";
    }
	

	


	
	
}
