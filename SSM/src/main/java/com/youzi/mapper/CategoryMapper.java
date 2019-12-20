package com.youzi.mapper;

import com.youzi.pojo.Category;

import java.util.List;

public interface CategoryMapper {

    public List<Category> list();

    public int login(String id,String password);
      
}