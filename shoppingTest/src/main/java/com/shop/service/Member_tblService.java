package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.Board;
import com.shop.dto.Member_tbl;
import com.shop.frame.MyService;
import com.shop.mapper.Member_tblMapper;

@Service
public class Member_tblService implements MyService<String, Member_tbl>{
	
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
}