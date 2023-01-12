package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.dto.Review;
import com.shop.frame.MyMapper;
@Repository
@Mapper
public interface ReviewMapper extends MyMapper<Integer, Review>{
	public List<Review> searchItemReview(Integer item_no) throws Exception;
}
