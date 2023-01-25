package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.Friendship;
import com.shop.dto.Member_tbl;
import com.shop.frame.MyService;
import com.shop.mapper.FriendshipMapper;

@Service
public class FriendshipService implements MyService<Integer, Friendship>{
	
	@Autowired
	FriendshipMapper mapper;

	@Override
	public void register(Friendship v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(Friendship v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Friendship get(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Friendship> get() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void join(Member_tbl member) {
		// TODO Auto-generated method stub
		
	}



	
}	