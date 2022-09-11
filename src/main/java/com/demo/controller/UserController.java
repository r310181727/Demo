package com.demo.controller;

import com.demo.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @Description
 * @Date: 2022/9/7 17:35
 */
@Controller("userController")
public class UserController {
    @Resource(name="userService")
    UserService userService;

    public void save(){
        userService.selectUser();
        System.out.println("userController的save方法执行...");
    }
}
