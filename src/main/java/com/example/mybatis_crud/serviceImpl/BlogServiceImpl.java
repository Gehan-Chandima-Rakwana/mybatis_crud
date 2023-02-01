package com.example.mybatis_crud.serviceImpl;

import com.example.mybatis_crud.model.Blog;
import com.example.mybatis_crud.repository.BlogRepository;
import com.example.mybatis_crud.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }
}
