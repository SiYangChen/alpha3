package com.telecom.controller;

import com.telecom.model.PageResult;
import com.telecom.model.User;
import com.telecom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lee on 01/01/2017.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/valid")
    @ResponseBody
    public PageResult<User> valid(@RequestParam(value = "name", required = true, defaultValue = "") String name,
                            @RequestParam(value = "password", required = true, defaultValue = "") String password) {

        PageResult<User> result = userService.query(name, password);
        return result;
    }
}
