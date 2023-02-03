package com.shop.controller;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shop.dto.Member_tbl;
import com.shop.frame.CryptoUtil;
import com.shop.frame.ImgUtil;
import com.shop.service.FriendshipService;
import com.shop.service.Member_tblService;

@Controller
@RequestMapping("/mypage")
public class MyPageController {

	@Autowired
	Member_tblService mservice;

	@Autowired
	FriendshipService fservice;

	@Value("${memimgdir}")
	String memimgdir;

	@RequestMapping("")
	public ModelAndView mypage(HttpServletRequest request) {

		HttpSession session = request.getSession();
		ModelAndView mv = new ModelAndView();

		Member_tbl myinfo = (Member_tbl) session.getAttribute("logincust"); // 로그인한 내 정보들

		mv.setViewName("mypage/mypage");
		mv.addObject("myinfo", myinfo);
		return mv;
	}

	@RequestMapping("/updateMyInfo")
	public Object updateMyInfo(HttpServletRequest request, Member_tbl member)
			throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeyException, NoSuchPaddingException,
			InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {

		HttpSession session = request.getSession();

		Member_tbl myinfo = (Member_tbl) session.getAttribute("logincust"); // 로그인한 내 정보들 <-여기서 수정해야함.
		int myno = myinfo.getMem_no();
		String myid = myinfo.getMem_id();

		String chpwd = member.getMem_pwd(); // 받아온 정보들
		System.out.println("내가입력한 비번: " + chpwd);
		String chnickname = member.getNickname();
		System.out.println("내가입력한 닉네임: " + chnickname);
		String chmbti = member.getMbti().toUpperCase();
		System.out.println("내가입력한 mbti: " + chmbti);
		String chimg = null;
		
		chimg = member.getImg().getOriginalFilename(); // DTO의 MultipartFile 를사용함(화면에서 이미지파일올릴때 이미지파일이름을 가져옴)
		System.out.println("내가입력한 이미지: " + chimg);
		
		if (chimg == null || chimg.equals("")) {
			System.out.println("이미지추가를 안한걸로 나와요");
			try {
				chimg = myinfo.getMem_img(); // 이미지를 업뎃안할때는 기존의 이미지를 가지고 와야지
				System.out.println("입력안할때 : " + chimg);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				chimg = member.getImg().getOriginalFilename(); // DTO의 MultipartFile 를사용함(화면에서 이미지파일올릴때 이미지파일이름을 가져옴)
				System.out.println("내가입력한 이미지2: " + chimg); 
				ImgUtil.saveFile(member.getImg(), memimgdir);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (chpwd.length() == 0) { // 받아온 정보들의 길이가 0이면 기존의 정보를 넣어주자.
			chpwd = myinfo.getMem_pwd();
		} else if (chpwd.length() != 0) {
			String key = "osomdosompasswd0077";
			String enStr = CryptoUtil.encryptAES256(chpwd, key);
			chpwd = enStr;
		}
		if (chnickname.length() == 0) {
			chnickname = myinfo.getNickname();
		}
		if (chmbti.length() == 0) {
			chmbti = myinfo.getMbti();
		}


		mservice.updateMyInfo(myno, chpwd, chnickname, chmbti, chimg); // <- dto에 회원번호, 비번,

		Member_tbl newMyInfo = new Member_tbl();
		try {
			newMyInfo = mservice.get(myid);
			System.out.println("newMyInfo2:" + newMyInfo);
			session.setAttribute("logincust", newMyInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:/";
	}


}
