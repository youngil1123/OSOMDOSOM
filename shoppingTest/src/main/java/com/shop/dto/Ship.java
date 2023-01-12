package com.shop.dto;

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
public class Ship {
	private int ship_no;
	private int cust_no;
	private String ship_name;
	private String ship_addr;
	private String ship_tel;
	
	public Ship(String ship_name, String ship_addr, String ship_tel, int ship_no) {
		super();
		this.ship_no = ship_no;
		this.ship_name = ship_name;
		this.ship_addr = ship_addr;
		this.ship_tel = ship_tel;
	}
	
	//
}
