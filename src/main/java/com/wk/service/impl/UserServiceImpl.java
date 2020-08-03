package com.wk.service.impl;

import com.wk.bean.User;
import com.wk.mapper.UserMapper;
import com.wk.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
