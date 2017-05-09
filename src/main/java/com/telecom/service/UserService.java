package com.telecom.service;

import com.telecom.model.PageResult;
import com.telecom.model.User;

/**
 * Created by lee on 09/05/2017.
 */
public interface UserService {
    PageResult<User> query(String name, String password);
}
