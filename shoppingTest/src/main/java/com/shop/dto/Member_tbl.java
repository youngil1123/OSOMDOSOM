package com.shop.dto;


import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Member_tbl {
	
	private int mem_no;
	private String mem_id;
	private String mem_pwd;
	private String mem_name;
	private String mem_tel;
	private String mem_email;
	private String mbti;
	private String nickname;
	private int mem_point;
	private String mem_img;
	

	
	  

// 이메일 찾기

	// 팔로워추가페이지 이미지출력
	private MultipartFile img;
	


// 아이디 찾기

	Member_tbl(String mem_name, String mem_email) {
		super();
		this.mem_name=mem_name;
		this.mem_email=mem_email;
	}
// 비밀번호 찾기
	Member_tbl(String mem_email) {
		super();
		this.mem_email=mem_email;
	
    }
}