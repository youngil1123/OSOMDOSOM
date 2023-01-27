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
public class TheaterInfo {
	private String mt20id; //공연ID
	private String prfnm; //공연명
	private String prfstate; //공연상태
	private String genrenm; //공연장르
	private String prfpdfrom;//공연시작일
	private String prfpdto;//공연종료일
	private String poster;//공연포스터 경로
	private String fcltynm;//공연장명
	private String prfruntime; //런타임
	private int con_no;
}
