package com.telecom.dao.impl;

import com.telecom.dao.CustomerApplyDao;
import com.telecom.model.CustomerApply;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lee on 09/05/2017.
 */

@Service
public class CustomerApplyDaoImpl implements CustomerApplyDao{
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<CustomerApply> pageQueryCustomerApply(Integer page, Integer pageSize) {
        return null;
    }

    @Override
    public List<CustomerApply> queryCustomerApplyByBusinessId(String businessId) {
        return null;
    }

    @Override
    public Boolean insertCustomerApply(CustomerApply customerApply) {
        return null;
    }
}
