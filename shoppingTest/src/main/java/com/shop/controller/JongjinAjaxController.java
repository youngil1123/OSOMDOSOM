package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.dto.Member_tbl;
import com.shop.service.Member_tblService;


@RestController
public class JongjinAjaxController {
	
	@Autowired
	Member_tblService mservice;
	
	@RequestMapping("/checkid")
	public Object checkid(String cid) {
		int result = 0;
		Member_tbl member =null;
		
		try {
			member = mservice.get(cid);
			if(member == null) {
				result= 1;
			}else {
				result =0;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
