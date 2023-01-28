package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.dto.TheaterInfo;
import com.shop.frame.MyMapper;
@Repository
@Mapper
public interface TheaterMapper extends MyMapper<String, TheaterInfo> {
	public List<String> getcd(String genrenm);
	public void updateconno(TheaterInfo t);
	public List<TheaterInfo> searchtheaterlist(String searchType,String keyword);
}
