package com.offcn.springbootmybatisdemo.controler;

import com.offcn.springbootmybatisdemo.mapper.UserMapper;
import com.offcn.springbootmybatisdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FtlController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/showUserList")
    public String getUserList(Model model){
        List<User> userList = userMapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        model.addAttribute("userList",userList);
        return "user";
    }
}
