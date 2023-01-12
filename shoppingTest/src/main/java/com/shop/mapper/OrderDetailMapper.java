package com.shop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.dto.OrderDetail;
import com.shop.frame.MyMapper;
@Repository
@Mapper
public interface OrderDetailMapper extends MyMapper<Integer, OrderDetail> {

}
