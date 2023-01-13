package com.shop.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.dto.Board;
import com.shop.frame.MyMapper;

@Mapper
@Repository
public interface BoardMapper extends MyMapper<Integer,Board>{

}
