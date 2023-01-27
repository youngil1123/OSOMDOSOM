package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.BookInfo;
import com.shop.dto.MovieInfo;
import com.shop.frame.MyService;
import com.shop.mapper.BookMapper;
@Service
public class BookService implements MyService<Integer, BookInfo>{

	@Autowired
	BookMapper bookmapper;

	@Override
	public void register(BookInfo v) throws Exception {
		// TODO Auto-generated method stub
		bookmapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(BookInfo v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BookInfo get(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookInfo> get() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Integer> getbookno() throws Exception{
		//책 순번들 가져오기
		return bookmapper.getbookno();
	}
	public void updatebookcd(BookInfo b) throws Exception{
		bookmapper.updatebookcd(b);
	}
	@Override
	public List<BookInfo> getsearchCheck(BookInfo bookinfo) throws Exception{
		retrun bookinfo.s
	}
	
}