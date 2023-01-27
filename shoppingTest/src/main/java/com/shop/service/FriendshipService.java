package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.Friendship;
import com.shop.frame.MyService;
import com.shop.mapper.FriendshipMapper;

@Service
public class FriendshipService implements MyService<Integer, Friendship>{
	
	@Autowired
	FriendshipMapper mapper;

	@Override
	public void register(Friendship v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(Friendship v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public Friendship get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Friendship> get() throws Exception {
		return mapper.selectall();
	}
	
	public List<Friendship> addfollower(String mem_id, String mem_id2) throws Exception {
		
		return mapper.selectall();
	}



	public Integer get(Friendship f) {
		return mapper.check(f);

	}


	
}	