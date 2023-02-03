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
import com.shop.service.BookService;
import com.shop.service.MovieService;
import com.shop.service.TheaterService;


@Controller
public class MediaController {
	
	@Autowired
	TheaterService theaterService;
	
	@Autowired
	MovieService movieService;

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


	@RequestMapping("/musical")
    public String musical(Model model) {
		
		model.addAttribute("top", "musical");
        return "/board/musical";
    }
	//책
	@RequestMapping("/book")
    public String book(Model model) {
		List<BookInfo> objs = new ArrayList<BookInfo>();
		try {
			objs = service.getbookreview();
			model.addAttribute("bookreviews", objs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("top", "book");
        return "/board/book";
    }
	
	//연극,뮤지컬
	@RequestMapping("/theater")
    public String getposter(Model model, String genrenm) {
		
		List<TheaterInfo> theater = new ArrayList<TheaterInfo>();
		
		if(genrenm=="연극") {
			try {
				theater = theaterService.gettheaterreview(genrenm);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} else {
			System.out.println("에러");
		}
		model.addAttribute("theaterreviews", theater);
		model.addAttribute("top", "theater");
        return "/board/theater";
    }
	//영화
	@RequestMapping("/movie")
    public String getmovie(Model model) {
		
		List<MovieInfo> movie = new ArrayList<MovieInfo>();
		
		try {
			movie = movieService.getmoviereview();
			model.addAttribute("moviereviews", movie);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("top", "movie");
        return "/board/movie";
    }

	


	
	
}
