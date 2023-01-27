package com.shop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.dto.Contents;
import com.shop.frame.MyMapper;
@Repository
@Mapper
public interface ContentsMapper extends MyMapper<Integer, Contents> {
	public int getconno(String con_cd);
}
