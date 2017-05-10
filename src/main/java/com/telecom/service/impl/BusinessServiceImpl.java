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
        PageResult<Business> result = new PageResult<>();
        result.setSuccess(true);
        result.setResult(businessDao.getBusiness(id));
        result.setTotal(1);
        return result;
    }

    @Override
    public PageResult<List<Business>> pageQueryBusiness(Integer page, Integer pageSize) {
        PageResult<List<Business>> result = new PageResult<>();
        List<Business> list = businessDao.pageQueryBusiness(page, pageSize);
        result.setSuccess(true);
        result.setResult(list);
        result.setTotal(list.size());
        result.setPage(page);
        result.setPageSize(pageSize);
        return null;
    }
}
