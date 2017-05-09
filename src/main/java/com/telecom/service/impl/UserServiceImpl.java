package com.telecom.service.impl;

import com.telecom.dao.UserDao;
import com.telecom.model.PageResult;
import com.telecom.model.User;
import com.telecom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lee on 09/05/2017.
 */

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;

    @Override
    public PageResult<User> query(String name, String password) {
        return null;
    }
}
