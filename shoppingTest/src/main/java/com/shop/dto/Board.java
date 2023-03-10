package com.shop.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Data
public class Board {
	private int board_no;
	private int con_no;
	private int mem_no;
	private Date writedate;
	private String title;
	private String review;
	private String partner;
	private String secret_memo;
	private int star_rate;
	
}
