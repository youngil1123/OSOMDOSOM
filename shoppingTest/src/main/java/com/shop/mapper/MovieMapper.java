package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.dto.BookInfo;
import com.shop.dto.MovieInfo;
import com.shop.frame.MyMapper;
@Repository
@Mapper
public interface MovieMapper extends MyMapper<String, MovieInfo> {
	public List<String> getmoviecd();
	public void updateconno(MovieInfo m);
	public List<MovieInfo> searchmovielist(String keyword);
}
