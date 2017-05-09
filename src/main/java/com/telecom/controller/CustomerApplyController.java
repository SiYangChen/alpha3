package com.telecom.controller;

import com.telecom.model.CustomerApply;
import com.telecom.model.PageResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lee on 09/05/2017.
 */

@Controller
@RequestMapping(value = "/customerApply")
public class CustomerApplyController {

    @RequestMapping(value = "/list")
    @ResponseBody
    public PageResult<List<CustomerApply>> list(@RequestParam("page") int page, @RequestParam("pageSize") int pageSize) {

        return null;
    }

    @RequestMapping(value = "/query")
    @ResponseBody
    public PageResult<List<CustomerApply>> query(@RequestParam("businessId") String businessId) {

        return null;
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    public PageResult<Boolean> add(@RequestBody CustomerApply customerApply) {

        return null;
    }
}
