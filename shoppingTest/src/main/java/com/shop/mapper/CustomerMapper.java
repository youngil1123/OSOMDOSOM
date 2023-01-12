package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.dto.Cart;
import com.shop.dto.Customer;
import com.shop.frame.MyMapper;


@Repository
@Mapper
public interface CustomerMapper extends MyMapper<String, Customer> {
	
}
