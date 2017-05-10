package com.telecom.dao.impl;

import com.telecom.dao.UserDao;
import com.telecom.model.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lee on 09/05/2017.
 */

@Repository
public class UserDapImpl implements UserDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public User query(String name, String password) {
        String sql = "SELECT * FROM user WHERE name=? AND password=?;";
        List<User> users = jdbcTemplate.query(sql, new Object[]{name, password}, new BeanPropertyRowMapper(User.class));

        if(users!=null && users.size()>0){
            User user = users.get(0);
            return user;
        }else{
            return null;
        }
    }
}
