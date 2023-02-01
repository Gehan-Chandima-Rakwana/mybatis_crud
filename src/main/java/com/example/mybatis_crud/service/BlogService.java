package com.example.mybatis_crud.service;

import com.example.mybatis_crud.model.Blog;

import java.util.List;

public interface BlogService{
    List<Blog> findAll();
}
