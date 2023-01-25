package com.shop.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.dto.Member_tbl;
import com.shop.frame.MyMapper;

@Mapper
@Repository
public interface Member_tblMapper extends MyMapper<String,Member_tbl>{



}
