package com.nefu.demo01.service.Impl;

import com.nefu.demo01.mapper.UserMapper;
import com.nefu.demo01.pojo.User;
import com.nefu.demo01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: fast
 * @description: 实现类
 * @author: nefulan
 * @create: 2019-11-15 16:44
 **/


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int getLogin(User user) {
        return userMapper.getLogin(user);
    }
}
