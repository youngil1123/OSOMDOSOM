package com.shop.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.dto.Board;
import com.shop.frame.MyMapper;

@Mapper
@Repository
public interface BoardMapper extends MyMapper<Integer,Board>{
	public List<Board> searchmylist(Integer mem_no); 
	public List<Board> searchmylist(String mem_id);
	public List<Board> list();
	
	
	
}
	
	

