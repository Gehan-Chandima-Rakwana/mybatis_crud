package com.example.mybatis_crud.service;

import com.example.mybatis_crud.model.User;

import java.util.List;


public interface UserService {
    List<User> findAll();
    List<User> findAllByFilter(int id);
}
