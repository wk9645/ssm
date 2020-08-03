package com.wk.service;

import com.wk.bean.User;

import java.util.List;


public interface IUserService {

    public User getUser(Integer id);

    public List<User> getAllUser();

}
