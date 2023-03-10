package com.shop.mapper;


import java.util.List;

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

	public List<Member_tbl> selectallfollower(Integer myNo) throws Exception;

	public void updateMyInfo(int mem_no, String mem_pwd, String nickname, String mbti, String mem_img);
	public void updatePoint(int mem_no) throws Exception;


	public Object findByMemberEmail(String mem_email);


	public void updatePassword(String mem_id, String mem_pwd);

}
