package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dto.Member_tbl;
import com.admin.frame.MyService;
import com.admin.mapper.Member_tblMapper;

@Service
public class Member_tblService implements MyService<String, Member_tbl> {

	@Autowired
	Member_tblMapper mapper;

	@Override
	public void register(Member_tbl v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String k) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(Member_tbl v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Member_tbl get(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member_tbl> get() throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectall();
	}
	
}



	

