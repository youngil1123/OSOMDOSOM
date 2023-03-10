package com.shop.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

//github.com/youngil1123/OSOMDOSOM.git
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shop.dto.Board;
import com.shop.dto.Member_tbl;
import com.shop.service.BoardService;
import com.shop.service.Member_tblService;


@Controller
public class BoardController {

	@Autowired
	BoardService boardservice;

	
	@Autowired
	Member_tblService mservice;


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

			return "board/myboard";	
		}


	@RequestMapping(value="/board/create_action",  method = RequestMethod.POST)		//작성된 게시글 등록 기능 메소드, html의 form 태그 action에서 입력한 주소
    public String insert(@ModelAttribute Board board, HttpSession session) throws Exception{
    	
		/* Integer.parseInt(board.getCon_no()); */
		Member_tbl member = null;
        member = (Member_tbl)session.getAttribute("logincust");
        int mem_no=member.getMem_no();
        board.setMem_no(mem_no);
		
		
    	System.out.println(board);
    	boardservice.register(board);
    	mservice.updatePoint(mem_no);
    	return "redirect:/myboard";	//내 글 페이지로 이동
    }
	

    }
	

