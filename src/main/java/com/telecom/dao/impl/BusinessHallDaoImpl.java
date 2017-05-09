package com.telecom.dao.impl;

import com.telecom.dao.BusinessHallDao;
import com.telecom.model.BusinessHall;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lee on 09/05/2017.
 */

@Service
public class BusinessHallDaoImpl implements BusinessHallDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public BusinessHall getBusinessHall(long id) {
        return null;
    }

    @Override
    public BusinessHall getNearestBusinessHall(Double longitude, Double latitude) {
        return null;
    }
}
