package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shop.dto.Member_tbl;
import com.shop.service.Member_tblService;

@RestController
public class DasomAjaxController {
	@Autowired
	Member_tblService mservice;
	
	
	
	//아이디찾기
	@RequestMapping("/findid")
    public Object findid(String mem_name, String mem_email ) {
		
        String mem_id = null;
        try {
            mem_id = mservice.findid(mem_name, mem_email);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mem_id;
    }
	
	
	//비밀버호찾기
    @RequestMapping("/findpwd")
    public Object findpwd(String mem_email) {
        String mem_pwd = null;
        try {
            mem_pwd = mservice.findpwd(mem_email);
            System.out.println(mem_pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mem_pwd;
    }
    
  
        
    

}
