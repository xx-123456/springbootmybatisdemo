package com.offcn.springbootmybatisdemo.controler;

import com.offcn.springbootmybatisdemo.mapper.UserMapper;
import com.offcn.springbootmybatisdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getUserList")
    public List<User> getUserList(){
       return userMapper.getUserList();
    }




}
