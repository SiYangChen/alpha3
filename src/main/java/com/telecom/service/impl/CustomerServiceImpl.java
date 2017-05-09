package com.telecom.service.impl;

import com.telecom.dao.CustomerApplyDao;
import com.telecom.model.CustomerApply;
import com.telecom.model.PageResult;
import com.telecom.service.CustomerApplyServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lee on 09/05/2017.
 */

@Service
public class CustomerServiceImpl implements CustomerApplyServie {
    @Autowired
    CustomerApplyDao customerApplyDao;

    @Override
    public PageResult<List<CustomerApply>> queryCustomerApplyByBusinessId(String businessId) {
        return null;
    }

    @Override
    public PageResult<List<CustomerApply>> pageQueryCustomerApply(Integer page, Integer pageSize) {
        return null;
    }

    @Override
    public PageResult<Boolean> insertCustomerApply(CustomerApply customerApply) {
        return null;
    }
}
