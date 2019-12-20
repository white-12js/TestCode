package com.youzi.service.impl;

import com.youzi.mapper.CategoryMapper;
import com.youzi.pojo.Category;
import com.youzi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryMapper categoryMapper;
	
	//查看全部的数据
	@Override
	public List<Category> list(){
		return categoryMapper.list();
	}

	@Override
	public int login(String id,String password) {
		return categoryMapper.login(id,password);
	}

}
