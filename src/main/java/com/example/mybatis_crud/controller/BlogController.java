package com.example.mybatis_crud.controller;

import com.example.mybatis_crud.model.Blog;
import com.example.mybatis_crud.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping()
    public List<Blog> findBlog(){
        return blogService.findAll();
    }
}
