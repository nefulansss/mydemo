package com.nefu.demo01.controller;

import com.nefu.demo01.pojo.User;
import com.nefu.demo01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @program: fast
 * @description: User的控制器
 * @author: nefulan
 * @create: 2019-11-15 16:23
 **/


@RestController
@RequestMapping("user")
public class UserController {




    @Autowired
    private UserService userService;


    @RequestMapping(value = "login",method = {RequestMethod.POST})
    public String getLogin(@RequestBody User user){



        int userId;
        if (user!=null){
            userId = userService.getLogin(user);
            return "返回成功!"+"user_id为"+userId;
        }
        return "查询失败";
    }


}
