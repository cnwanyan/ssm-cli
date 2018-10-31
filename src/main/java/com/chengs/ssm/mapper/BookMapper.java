package com.chengs.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.chengs.ssm.entity.Book;

@Mapper
public interface BookMapper {

	@Select("select * from book")
	List<Book> findAll();
}
