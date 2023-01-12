package com.shop.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Review {
	private int rev_no;
	private int cust_no;
	private int item_no;
	private String review;
	private Date rdate;
	
	private String cust_name;
	private String item_name;
	public Review(int cust_no, int item_no, String review) {
		this.cust_no = cust_no;
		this.item_no = item_no;
		this.review = review;
	}
	public Review(int rev_no, String review) {
		this.rev_no = rev_no;
		this.review = review;
	}
	
}
