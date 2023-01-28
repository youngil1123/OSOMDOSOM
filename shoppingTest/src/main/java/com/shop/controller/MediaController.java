package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MediaController {
	


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
		
		model.addAttribute("top", "book");
        return "/board/book";
    }
	@RequestMapping("/theater")
    public String theater(Model model) {
		
		model.addAttribute("top", "theater");
        return "/board/theater";
    }
	

	


	
	
}
