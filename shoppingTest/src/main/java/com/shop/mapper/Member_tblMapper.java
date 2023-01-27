package com.shop.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.dto.Member_tbl;
import com.shop.frame.MyMapper;

@Mapper
@Repository
public interface Member_tblMapper extends MyMapper<String,Member_tbl>{
	public Integer findmem_no(String mem_id);
	public String findid(String mem_name, String mem_email);
	public String findpwd(String mem_id, String mem_email);
	public Integer idCheck(String mem_id);
}
