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
public class Board {
	private int board_no;
	private int con_no;
	private int mem_no;
	private Date writedate;
	private String review;
	private String partner;
	private String secret_memo;
	private int star_rate;
	
}
