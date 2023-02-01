package com.example.mybatis_crud.repository;

import com.example.mybatis_crud.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface UserRepository {
    List<User> findAll();

    List<User> findAllByFilter(HashMap<String, Object> map);
}
