package com.chengs.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chengs.ssm.entity.Book;
import com.chengs.ssm.mapper.BookMapper;
import com.chengs.ssm.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookMapper bookMapper;
	
	@Override
	public List<Book> findAll() {
		return bookMapper.findAll();
	}

}
