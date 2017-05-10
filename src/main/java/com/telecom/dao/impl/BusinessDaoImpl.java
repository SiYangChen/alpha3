package com.telecom.dao.impl;

import com.telecom.dao.BusinessDao;
import com.telecom.model.Business;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lee on 09/05/2017.
 */

@Repository
public class BusinessDaoImpl implements BusinessDao{
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Business> pageQueryBusiness(Integer page, Integer pageSize) {
        String sql = "SELECT * FROM business";
        List<Business> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Business.class));
        return page(list, page, pageSize);
    }

    @Override
    public Business getBusiness(long id) {
        String sql = "SELECT * FROM business WHERE id=?";
        List<Business> list = jdbcTemplate.query(sql, new Object[]{id}, new BeanPropertyRowMapper(Business.class));
        if (null != list && list.size() > 0) {
            Business business = list.get(0);
            return business;
        } else {
            return null;
        }
    }

    @Override
    public Business getBusinessByKey(String businessKey) {
        String sql = "SELECT * FROM business WHERE business_id=?";
        List<Business> list = jdbcTemplate.query(sql, new Object[]{businessKey}, new BeanPropertyRowMapper(Business.class));
        if (null != list && list.size() > 0) {
            Business business = list.get(0);
            return business;
        } else {
            return null;
        }
    }

    private List<Business> page(List<Business> temp, int page, int pageSize) {
        int start = Math.max(Math.min((page - 1) * pageSize, temp.size()), 0);
        int end = Math.min(page * pageSize, temp.size());
        return temp.subList(start, end);
    }
}
