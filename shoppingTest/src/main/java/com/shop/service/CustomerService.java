package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.Cart;
import com.shop.dto.Customer;
import com.shop.frame.MyService;
import com.shop.mapper.CartMapper;
import com.shop.mapper.CustomerMapper;

@Service
public class CustomerService implements MyService<String, Customer>{

	@Autowired
	CustomerMapper mapper;
	@Autowired
	CartMapper Cartmapper;

	@Override
	public void register(Customer v) throws Exception {
		// TODO Auto-generated method stub
		mapper.insert(v);
	}

	@Override
	public void remove(String k) throws Exception {
		// TODO Auto-generated method stub
		mapper.delete(k);
	}

	@Override
	public void modify(Customer v) throws Exception {
		// TODO Auto-generated method stub
		mapper.update(v);
	}

	@Override
	public Customer get(String k) throws Exception {
		// TODO Auto-generated method stub
		return mapper.select(k);
	}

	@Override
	public List<Customer> get() throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectall();
	}
	
	//사용자 장바구니 조회
	public List<Cart> myCart(Integer cust_no) throws Exception{
		return Cartmapper.myCart(cust_no);
		
	}
}	
	
