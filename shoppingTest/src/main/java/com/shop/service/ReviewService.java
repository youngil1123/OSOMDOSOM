package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.Review;
import com.shop.frame.MyService;
import com.shop.mapper.ReviewMapper;
@Service
public class ReviewService implements MyService<Integer, Review> {

	@Autowired
	ReviewMapper mapper;
	@Override
	public void register(Review v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(Review v) throws Exception {
		mapper.update(v);
	}

	@Override
	public Review get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Review> get() throws Exception {
		return mapper.selectall();
	}
	public List<Review> searchItemReview(Integer item_no) throws Exception{
		return mapper.searchItemReview(item_no);
		
	}

}
