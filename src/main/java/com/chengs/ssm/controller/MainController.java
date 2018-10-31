package com.chengs.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chengs.ssm.entity.Book;
import com.chengs.ssm.service.BookService;

@Controller
public class MainController {

	@Autowired
	BookService bookService;
	
	@RequestMapping("hello")
	public String jsp() {
		return "hello";
	}
	
	@RequestMapping("book")
	@ResponseBody
	public List<Book> allBook() {
		return bookService.findAll();
	}
	
}
