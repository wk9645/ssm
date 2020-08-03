package com.wk.mapper;

import com.wk.bean.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserMapper {

    public User getUserById(Integer id);
    public List<User> getAllUser();
}
