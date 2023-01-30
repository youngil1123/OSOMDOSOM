package com.shop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shop.dto.Friendship;
import com.shop.dto.Member_tbl;
import com.shop.service.FriendshipService;
import com.shop.service.Member_tblService;


@Controller
@RequestMapping("/follower")
public class JongjinController {
	
	@Autowired
	Member_tblService mservice;
	
	@Autowired
	FriendshipService fservice;
	
	@RequestMapping("")
	public ModelAndView follower(HttpServletRequest request) {

		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		Member_tbl member = (Member_tbl) session.getAttribute("logincust");

		// ArrayList heart = new ArrayList();

		String myid = member.getMem_id(); // 로그인한 아이디
		// System.out.println(myid);
		int myNo = mservice.findmem_no(myid); // 로그인 아이디의 회원번호
		// System.out.println(myNo);

		Friendship friendship = new Friendship();
		int myid_no = mservice.findmem_no(member.getMem_id());

		try {
			List<Member_tbl> list = mservice.getfollower(myNo); // 해당 회원번호가 팔로우중인 사람들의 정보를 리스트에 담음.
			System.out.println(list);
			System.out.println(list.get(0).getMem_no());
			for (int i = 0; i < list.size(); i++) {
				int fwNo = list.get(i).getMem_no(); // 해당번째의 회원의 회원번호
				friendship.setMem_no(fwNo);
				friendship.setMem_no2(myNo);
				Integer chk = fservice.get(friendship);
				if(chk != null) {
					list.get(i).setHeart("heart.png");
					// heart.add("heart.png");
				} else {
					list.get(i).setHeart("followok.png");
					// heart.add("followok.png");
				}
			}
			// System.out.println(heart);
			mv.setViewName("/follower/follower");
			mv.addObject("followerinfo", list);
			// mv.addObject("heart", heart);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return mv;
	}
	 
	
//	@RequestMapping("")
//	public String Follower() {
//		return "follower/follower";
//	}
	
	
	@RequestMapping("/addFollower")
    public String addFollower() {
        return "follower/addFollower";
    }
	

	

	
}
