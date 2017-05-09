package com.telecom.controller;

import com.telecom.model.PageResult;
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

    @RequestMapping("/valid")
    @ResponseBody
    public PageResult<Boolean> valid(@RequestParam(value = "name", required = true, defaultValue = "") String name,
                            @RequestParam(value = "password", required = true, defaultValue = "") String password) {

        return null;
    }
}
