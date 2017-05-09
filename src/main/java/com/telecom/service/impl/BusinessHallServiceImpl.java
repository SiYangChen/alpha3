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
        return null;
    }

    @Override
    public PageResult<BusinessHall> getNearestBusinessHall(Double longitude, Double latitude) {
        return null;
    }
}
