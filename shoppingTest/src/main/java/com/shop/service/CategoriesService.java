package com.shop.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.Categories;
import com.shop.frame.MyService;
import com.shop.mapper.CategoriesMapper;

@Service
public class CategoriesService implements MyService<Integer, Categories>{
	@Autowired
	CategoriesMapper mapper;

	@Override
	public void register(Categories v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(Categories v) throws Exception {
		mapper.update(v);
	}

	@Override
	public Categories get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Categories> get() throws Exception {
		return mapper.selectall();
	}

	
}