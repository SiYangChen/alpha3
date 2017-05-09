package com.telecom.controller;

import com.alibaba.fastjson.JSONObject;
import com.telecom.model.Business;
import com.telecom.model.PageResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lee on 09/05/2017.
 */
@Controller
@RequestMapping(value = "/business")
public class BusinessController {

    @RequestMapping(value = "/list")
    @ResponseBody
    public PageResult<List<Business>> list() {

        return null;
    }

    @RequestMapping(value = "/get")
    @ResponseBody
    public PageResult<Business> get(@RequestParam(value = "id") long id) {
        return null;
    }
}
