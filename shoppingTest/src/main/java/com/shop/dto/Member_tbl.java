package com.shop.dto;


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
}
