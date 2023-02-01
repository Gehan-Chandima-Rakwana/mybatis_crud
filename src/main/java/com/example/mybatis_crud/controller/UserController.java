package com.example.mybatis_crud.controller;

import com.example.mybatis_crud.model.Blog;
import com.example.mybatis_crud.model.User;
import com.example.mybatis_crud.service.BlogService;
import com.example.mybatis_crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("{id}")
    public List<User> findAllByFilter(@PathVariable("id") int id){
        return userService.findAllByFilter(id);
    }

}
