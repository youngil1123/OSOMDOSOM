package com.shop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
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
		Member_tbl member = null;

		try {
			member = mservice.get(cid);
			if (member != null) {
				String imgname = member.getMem_img();
				System.out.println(imgname);
				result = imgname;
				if (result == null || result == "") {
					result = "follow.png";
				}
			} else {
				result = null;
			}
		} catch (Exception e) {

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
		Member_tbl member = (Member_tbl) session.getAttribute("logincust");
		System.out.println(member);

		int myid_no = mservice.findmem_no(member.getMem_id());
		int fwid_no = mservice.findmem_no(fwid);
		System.out.println(myid_no + " " + fwid_no);

		friendship.setMem_no(myid_no);
		friendship.setMem_no2(fwid_no);

		Integer chk = fservice.get(friendship);
		System.out.println("해당 팔로워가 있는 컬럼숫자: " + chk);
		if (chk == null) {
			fservice.register(friendship);

			return fwid;
		} else {
			return "false";
		}

	}

	@RequestMapping("/DeleteFw")
	public Integer DeleteFw(String dfwid, HttpServletRequest request) throws Exception {

		Friendship friendship = new Friendship();

		int result = 0;

		HttpSession session = request.getSession();
		Member_tbl member = (Member_tbl) session.getAttribute("logincust"); // 로그인한 아이디의 정보
		System.out.println(member);

		int myid_no = mservice.findmem_no(member.getMem_id());
		int dfwid_no = mservice.findmem_no(dfwid);
		System.out.println(myid_no + " " + dfwid_no);

		friendship.setMem_no(myid_no);
		friendship.setMem_no2(dfwid_no);

		Integer chk = fservice.get(friendship);
		System.out.println("해당 팔로워가 있는 컬럼숫자: " + chk);

		if (chk != null) {
			fservice.remove(friendship);
			result = 1;
			return result;
		} else {
			return result;
		}
	}

}

