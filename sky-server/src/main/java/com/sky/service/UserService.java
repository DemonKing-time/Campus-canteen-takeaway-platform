package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;

/**
 * @author zc
 * @create 2023-08-08-16:36
 */
public interface UserService {
    //微信登录
    User wxLogin(UserLoginDTO userLoginDTO);
}
