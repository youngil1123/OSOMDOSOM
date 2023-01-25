package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.Board;
import com.shop.dto.Member_tbl;
import com.shop.frame.MyService;
import com.shop.mapper.BoardMapper;

@Service
public class BoardService implements MyService<Integer, Board>{
	
	@Autowired
	BoardMapper mapper;

	@Override
	public void register(Board v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(Board v) throws Exception {
		mapper.update(v);
	}

	@Override
	public Board get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Board> get() throws Exception {
		return mapper.selectall();
	}



}	