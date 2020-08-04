package com.wk.controller;

import com.wk.bean.User;
import com.wk.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value="/getUser/{id}")
    @ResponseBody
    public User getUser(@PathVariable(value = "id")Integer id){
        return userService.getUser(id);
    }
    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }
}
