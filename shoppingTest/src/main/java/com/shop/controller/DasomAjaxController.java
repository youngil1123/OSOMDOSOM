package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    
   //아이디 중복체크
        
          
        
    
/*
 * @RequestMapping(value = "/checkSignup", method = RequestMethod.POST)
 * public @ResponseBody String AjaxView(
 * 
 * @RequestParam("id") String id){ String str = ""; int idcheck =
 * dbPro.idCheck(id); if(idcheck==1){ //이미 존재하는 계정 str = "NO"; }else{ //사용 가능한
 * 계정 str = "YES"; } return str; } }
 */

    }
    
}
