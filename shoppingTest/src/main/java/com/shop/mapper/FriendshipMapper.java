package com.shop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.dto.Friendship;
import com.shop.frame.MyMapper;

@Mapper
@Repository
public interface FriendshipMapper extends MyMapper<Integer,Friendship>{

}
