package com.telecom.dao;

import com.telecom.model.User;

/**
 * Created by lee on 09/05/2017.
 */
public interface UserDao {

    User query(String name, String password);
}
