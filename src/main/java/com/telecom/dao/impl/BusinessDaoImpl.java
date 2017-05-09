package com.telecom.dao.impl;

import com.telecom.dao.BusinessDao;
import com.telecom.model.Business;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lee on 09/05/2017.
 */

@Service
public class BusinessDaoImpl implements BusinessDao{
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Business> pageQueryBusiness(Integer page, Integer pageSize) {
        return null;
    }

    @Override
    public Business getBusiness(long id) {
        return null;
    }
}
