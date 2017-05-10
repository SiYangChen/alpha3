package com.telecom.dao.impl;

import com.telecom.dao.BusinessHallDao;
import com.telecom.model.BusinessHall;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lee on 09/05/2017.
 */

@Service
public class BusinessHallDaoImpl implements BusinessHallDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public BusinessHall getBusinessHall(long id) {
        String sql  = "SELECT * FROM business_hall WHERE id=?";
        List<BusinessHall> list = jdbcTemplate.query(sql, new Object[]{id}, new BeanPropertyRowMapper(BusinessHall.class));
        if (null != list && list.size() > 0) {
            BusinessHall businessHall = list.get(0);
            return businessHall;
        } else {
            return null;
        }
    }

    @Override
    public BusinessHall getNearestBusinessHall(Double longitude, Double latitude) {
        String sql = "SELECT * FROM business_hall WHERE longitude=? AND latitude";
        List<BusinessHall> list = jdbcTemplate.query(sql, new Object[]{longitude, latitude}, new BeanPropertyRowMapper(BusinessHall.class));
        if (null != list && list.size() > 0) {
            BusinessHall businessHall =list.get(0);
            return  businessHall;
        } else {
            return null;
        }
    }
}
