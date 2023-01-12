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
public class OrderDetail {
	public int orderdetail_code;
	public int item_no;
	public int ship_no;
	public int cnt;
	public String request;
	public int totalprice;
}
