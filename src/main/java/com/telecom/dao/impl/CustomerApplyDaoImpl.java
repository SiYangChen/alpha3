package com.telecom.dao.impl;

import com.telecom.dao.CustomerApplyDao;
import com.telecom.model.CustomerApply;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
        String sql = "SELECT * FROM customer_apply;";
        List<CustomerApply> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper(CustomerApply.class));
        return page(list, page, pageSize);
    }

    @Override
    public List<CustomerApply> queryCustomerApplyByBusinessId(String businessId, Integer page, Integer pageSize) {
        String sql =  "SELECT * FROM customer_apply WHERE businessId=?";
        List<CustomerApply> list = jdbcTemplate.query(sql, new Object[]{businessId}, new BeanPropertyRowMapper(CustomerApply.class));
        return page(list, page, pageSize);
    }

    @Override
    public Boolean insertCustomerApply(CustomerApply customerApply) {
        return jdbcTemplate.update("INSERT INTO customer_apply(name, phone, langitude, latitude, apply_time, business_id) values(?, ?, ?, ?, ?, ?)",
                customerApply.getName(), customerApply.getPhone(), customerApply.getLongitude(),
                customerApply.getLatitude(),customerApply.getApplyTime(), customerApply.getBusinessKey()) > 0;
    }

    private List<CustomerApply> page(List<CustomerApply> temp, int page, int pageSize) {
        int start = Math.max(Math.min((page - 1) * pageSize, temp.size()), 0);
        int end = Math.min(page * pageSize, temp.size());
        return temp.subList(start, end);
    }
}
