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
public class Cart {
	
	private int cart_no;
	private int item_no;
	private int cust_no;
	private int total;
	
	private String id;
	private String name;
	private String item_name;
	private int item_price;
	private Date item_rdate;
	
	public Cart(int item_no, int cust_no, int total) {
		super();
		this.item_no = item_no;
		this.cust_no = cust_no;
		this.total = total;
	}

	public Cart(int cust_no, int total) {
		super();
		this.cust_no = cust_no;
		this.total = total;
	}
	
	

	}

