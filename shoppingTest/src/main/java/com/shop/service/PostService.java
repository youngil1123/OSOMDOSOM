package com.shop.service;

import org.springframework.stereotype.Service;

import com.shop.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
	
	private final BoardMapper boardmapper;
}
