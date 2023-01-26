package com.shop.controller;

import java.io.Console;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.dto.Friendship;
import com.shop.dto.Member_tbl;
import com.shop.service.FriendshipService;
import com.shop.service.Member_tblService;


@RestController
@RequestMapping("/follower")
public class JongjinAjaxController {
	
	@Autowired
	Member_tblService mservice;
	
	@Autowired
	FriendshipService fservice;
	
	@RequestMapping("/checkid")
	public Object checkid(String cid) {
		String result = null;
		Member_tbl member =null;
		
		try {
			member = mservice.get(cid);
			String imgname = member.getMem_img();
			if(member == null) {
				result = "no_memberImg";
			}else {
				result = imgname;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	// 팔로워 아이디를 통해 회원번호를 받아와서 Friendship table에 넣는다.
	// 이때 자기의 회원번호는 session을 통해서 받아온다. 
	
	  @RequestMapping("/AddFwTbl") 
	  public Object addFollower(String fwid, HttpServletRequest request) throws Exception {
		  
	  Friendship friendship = new Friendship();
	 
	  HttpSession session = request.getSession();
	  Member_tbl member =(Member_tbl)session.getAttribute("member");
	  System.out.println(member);
	  
	  int myid_no = mservice.findmem_no(member.getMem_id()); 
	  int fwid_no = mservice.findmem_no(fwid);
	  System.out.println(myid_no+" "+fwid_no);

	  
	  friendship.setMem_no(myid_no); 
	  friendship.setMem_no2(fwid_no);

	  Integer chk = fservice.get(friendship);
	  System.out.println("해당 팔로워가 있는 컬럼숫자: "+chk);
	  if(chk == null ) {
		  fservice.register(friendship);
		  
		  return fwid; 
	  }else {
		  return "false";
	  }
	  
	  
	  }
	 
	 
}
