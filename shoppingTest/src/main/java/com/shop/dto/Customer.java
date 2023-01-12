package com.shop.dto;

import java.util.Date;

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
public class Customer {
	
	private int cust_no; 
	private String name;
	private String id;
	private String pwd;
	private String tel;
	private String email;
	private Date cust_rdate;
	
}
