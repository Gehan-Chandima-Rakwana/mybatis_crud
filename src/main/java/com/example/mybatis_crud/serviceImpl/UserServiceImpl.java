package com.example.mybatis_crud.serviceImpl;

import com.example.mybatis_crud.model.User;
import com.example.mybatis_crud.repository.UserRepository;
import com.example.mybatis_crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public List<User> findAllByFilter(int id) {
        HashMap<String,Object> map = new HashMap<>();
        map.put("userId",id);
        map.put("limit",1);
        return userRepository.findAllByFilter(map);
    }
}
