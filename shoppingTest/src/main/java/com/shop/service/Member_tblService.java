package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.Board;
import com.shop.dto.Member_tbl;
import com.shop.frame.MyService;
import com.shop.mapper.Member_tblMapper;

@Service
public class Member_tblService implements MyService<String, Member_tbl> {

	@Autowired
	
	Member_tblMapper mapper;

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
	
	public void join(Member_tbl member) {
		try {
			mapper.insert(member);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public String findid(String mem_name, String mem_email) {
		// TODO Auto-generated method stub
		return null;
	}

	public String findpwd(String mem_email) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Integer findmem_no(String mem_id) {
		
		return mapper.findmem_no(mem_id);
	}

	 
}

	

