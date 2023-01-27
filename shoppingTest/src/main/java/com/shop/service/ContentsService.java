package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.Contents;
import com.shop.frame.MyService;
import com.shop.mapper.ContentsMapper;
@Service
public class ContentsService implements MyService<Integer, Contents>{

	@Autowired
	ContentsMapper contentsmapper;
	@Override
	public void register(Contents v) throws Exception {
		contentsmapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(Contents v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Contents get(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contents> get() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	public int getconno(String con_cd) throws Exception{
		return contentsmapper.getconno(con_cd);
	}

	
}