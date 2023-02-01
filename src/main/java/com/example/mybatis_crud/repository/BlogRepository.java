package com.example.mybatis_crud.repository;

import com.example.mybatis_crud.model.Blog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BlogRepository {
    List<Blog> findAll();
}
