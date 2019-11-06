package com.offcn.springbootmybatisdemo;


import com.offcn.springbootmybatisdemo.mapper.UserMapper;
import com.offcn.springbootmybatisdemo.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootmybatisdemoApplication.class)
public  class SpringbootmybatisdemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void getUserList(){
        List<User> userList = userMapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void test01(){
        redisTemplate.opsForValue().set("hello","0708");
        Object str = redisTemplate.opsForValue().get("hello");
        System.out.println(str);
        User user=new User();
        user.setUid(3);
        user.setUname("admin");
        user.setPassword("123");
        redisTemplate.opsForValue().set("user",user);
        User user1 = (User) redisTemplate.opsForValue().get("user");
        System.out.println(user1);
    }
}
