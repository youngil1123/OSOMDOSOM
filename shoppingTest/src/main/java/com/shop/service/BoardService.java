package com.shop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shop.dto.Board;
import com.shop.dto.MovieInfo;
import com.shop.frame.MyService;
import com.shop.mapper.BoardMapper;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class BoardService implements MyService<Integer, Board>{
	

	
	@Autowired
	BoardMapper mapper;

	@Override
	public void register(Board v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(Board v) throws Exception {
		mapper.update(v);
	}

	@Override
	public Board get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Board> get() throws Exception {
		return mapper.selectall();
	}
	
	public List<Board> list() throws Exception {
		return mapper.list();
	}
	
	/*@Transactional
    public List<MovieInfo> getMovieInfoList() {
		
		 List<MovieInfo> movieList = movieRepository.findAll();
	        List<MovieInfo> boardDtoList = new ArrayList<>();

	        for(MovieInfo movieInfo : movieList) {
	        	MovieInfo boardDto = MovieInfo.builder()
	                    .id(board.getId())
	                    .author(board.getAuthor())
	                    .title(board.getTitle())
	                    .content(board.getContent())
	                    .createdDate(board.getCreatedDate())
	                    .build();
	            boardDtoList.add(boardDto);
	        }
	        return boardDtoList;
	    }*/
		
		
	}


