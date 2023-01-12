package com.shop.dto;

import java.util.Date;

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
public class content {
	private int con_no;
	private int no3;
	private String con_name;
	private String con_content;
	private String runningtime;
	private String character;
	private Date writedate;
	private String location;
	private String bo_author;
	private String bo_publisher;
	private int bo_price;
}
