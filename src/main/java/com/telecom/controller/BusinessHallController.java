package com.telecom.controller;

import com.alibaba.fastjson.JSONObject;
import com.telecom.model.BusinessHall;
import com.telecom.model.PageResult;
import com.telecom.service.BusinessHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lee on 09/05/2017.
 */
@Controller
@RequestMapping(value = "/businessHall")
public class BusinessHallController {

    @Autowired
    BusinessHallService businessHallService;

    @RequestMapping(value = "/get")
    @ResponseBody
    public PageResult<BusinessHall> get(@RequestParam(value = "id", required = true) long id) {
        JSONObject json = new JSONObject();

        return null;
    }

    @RequestMapping(value = "/nearest")
    @ResponseBody
    public PageResult<BusinessHall> nearest(@RequestParam(value = "longitude", required = true) Double longitude,
                          @RequestParam(value = "latitude", required = true) Double latitude ) {

        return null;
    }
}
