package com.telecom.dao.impl;

import com.telecom.dao.UserDao;
import com.telecom.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lee on 09/05/2017.
 */

@Service
public class UserDapImpl implements UserDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public User query(String name, String password) {
        return null;
    }
}
