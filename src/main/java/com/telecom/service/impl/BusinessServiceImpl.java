package com.telecom.service.impl;

import com.telecom.dao.BusinessDao;
import com.telecom.model.Business;
import com.telecom.model.PageResult;
import com.telecom.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lee on 09/05/2017.
 */

@Service
public class BusinessServiceImpl implements BusinessService{
    @Autowired
    BusinessDao businessDao;

    @Override
    public PageResult<Business> getBusiness(long id) {
        return null;
    }

    @Override
    public PageResult<List<Business>> pageQueryBusiness(Integer page, Integer pageSize) {
        return null;
    }
}
