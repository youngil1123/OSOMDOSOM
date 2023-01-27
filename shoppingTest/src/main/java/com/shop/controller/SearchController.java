package com.shop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.dto.BookInfo;
import com.shop.service.BoardService;
import com.shop.service.BookService;
import com.shop.service.ContentsService;
import com.shop.service.MovieService;
import com.shop.service.TheaterService;

@Controller
public class SearchController {
	
	private BookService bookService;
	private ContentsService contentsService;
	private MovieService MovieService;
	private TheaterService TheaterService;
	private BoardService boardService;
	
	
	public SearchController(BoardService boardService) {
        this.boardService = boardService;
    }
	
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
		
		
		@GetMapping("/searchCheck")
		@ResponseBody
	    public List<BookInfo> getsearhCheck(@RequestParam("type") String type, @RequestParam("keyword") String keyword, Model model) throws Exception {
			
			BookInfo bookinfo = new BookInfo();
			bookinfo.setType(type);
			bookinfo.setType(keyword);
			
	        return BookService.getSearchCheck(bookinfo);
	    }
}
