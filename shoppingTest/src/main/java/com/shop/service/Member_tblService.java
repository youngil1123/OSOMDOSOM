package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.Member_tbl;
import com.shop.frame.MyService;
import com.shop.mapper.Member_tblMapper;

@Service
public class Member_tblService implements MyService<String, Member_tbl> {

	@Autowired
	
	Member_tblMapper mapper;
	
	//회원가입
	@Override
	public void register(Member_tbl v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(String k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(Member_tbl v) throws Exception {
		mapper.update(v);
	}

	@Override
	public Member_tbl get(String k) throws Exception {
		return mapper.select(k);
		
	}

	@Override
	public List<Member_tbl> get() throws Exception {
		return mapper.selectall();
	}
	
	
	public int idCheck(String mem_id) {
		int cnt = mapper.idCheck(mem_id);
		System.out.println("cnt: " + cnt);
		return cnt;
	}	


	/* 아이디찾기 */
	public String findid(String mem_name, String mem_email) {
		return mapper.findid(mem_name, mem_email);
	}

	public String findpwd(String mem_id, String mem_email) {
		return mapper.findpwd(mem_id, mem_email);
	}
	
	public Integer findmem_no(String mem_id) {
		
		return mapper.findmem_no(mem_id);
	}




		
}



	

