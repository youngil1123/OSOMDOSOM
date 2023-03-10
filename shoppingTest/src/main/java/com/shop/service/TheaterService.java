package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.MovieInfo;
import com.shop.dto.TheaterInfo;
import com.shop.frame.MyService;
import com.shop.mapper.TheaterMapper;
@Service
public class TheaterService implements MyService<String, TheaterInfo>{

	@Autowired
	TheaterMapper theatermapper;
	
	@Override
	public void register(TheaterInfo v) throws Exception {
		theatermapper.insert(v);
	}

	@Override
	public void remove(String k) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(TheaterInfo v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TheaterInfo get(String k) throws Exception {
		// TODO Auto-generated method stub
		return theatermapper.select(k);
	}
	
	@Override
	public List<TheaterInfo> get() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> getcd(String genrenm) throws Exception{
		return theatermapper.getcd(genrenm);
	}
	public void updateconno(TheaterInfo t) throws Exception{
		theatermapper.updateconno(t);
	}
	public List<TheaterInfo> searchtheaterlist(String keyword){
		return theatermapper.searchtheaterlist(keyword);
	}
	public List<TheaterInfo> gettheaterreview(String genrenm) throws Exception{
		return theatermapper.gettheaterreview(genrenm);
	}
	public List<TheaterInfo> getonetheaterreview(String mt20id) throws Exception{
		//
		return theatermapper.getonetheaterreview(mt20id);
	}
	


	


}
