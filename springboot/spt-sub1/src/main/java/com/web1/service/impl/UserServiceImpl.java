package com.web1.service.impl;
/***
 *
 * @author:fsn
 * @date: 2020/1/5 16:37
 * @version
 */

import com.web1.mapper.UserMapper;
import com.web1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fang
 * @date 2020/1/5
 **/
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int selectUserCount() {
        return userMapper.selectUserCount();
    }

    @Override
    public int selectUserByKey(int key) {
        return userMapper.selectUserByKey(key);
    }
}
