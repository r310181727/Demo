package com.demo.service.Impl;

import com.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Date: 2022/9/7 17:33
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void selectUser() {
        System.out.println("userService的查询方法已经执行。。。");
    }
}
