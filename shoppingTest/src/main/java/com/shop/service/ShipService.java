package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.Ship;
import com.shop.frame.MyService;
import com.shop.mapper.ShipMapper;

@Service
public class ShipService implements MyService<Integer, Ship> {
	
	@Autowired
	ShipMapper mapper;

	@Override
	public void register(Ship v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(Ship v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public Ship get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Ship> get() throws Exception {
		return mapper.selectall();
	}

}

