package com.cmhzteam.service.lrh.Impl;

import com.cmhzteam.dao.lrh.UserMapper;
import com.cmhzteam.entity.lrh.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cmhzteam.service.lrh.UserService;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户功能实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean findUser(String Mobile) {
        User u = userMapper.selectUserByUsername(Mobile);
        if (u != null) {
            return false;
        }
        return true;
    }

    @Override
    public User login(String Mobile, String password) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("username", Mobile);
        map.put("password", password);
        User u = userMapper.selectUserByUsernameAndPassword(map);
        if (u != null) {
            return u;
        }
        return null;
    }

    @Override
    public boolean register(String Mobile, String password) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Mobile", Mobile);
        map.put("password", password);
        int flag = userMapper.insertUser(map);
        if (flag > 0) {
            return true;
        }
        return false;
    }
}
