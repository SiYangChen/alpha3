package com.telecom.service.impl;

import com.telecom.dao.BusinessHallDao;
import com.telecom.model.BusinessHall;
import com.telecom.model.PageResult;
import com.telecom.service.BusinessHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lee on 09/05/2017.
 */

@Service
public class BusinessHallServiceImpl implements BusinessHallService{
    @Autowired
    BusinessHallDao businessHallDao;

    @Override
    public PageResult<BusinessHall> getBusinessHall(long id) {
        PageResult<BusinessHall> result = new PageResult<>();
        result.setSuccess(true);
        result.setResult(businessHallDao.getBusinessHall(id));
        result.setTotal(1);
        return result;
    }

    @Override
    public PageResult<BusinessHall> getNearestBusinessHall(Double longitude, Double latitude) {
        PageResult<BusinessHall> result = new PageResult<>();
        result.setSuccess(true);
        result.setResult(businessHallDao.getNearestBusinessHall(longitude, latitude));
        result.setTotal(1);
        return null;
    }
}
