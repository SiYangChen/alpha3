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
    public PageResult<List<CustomerApply>> queryCustomerApplyByBusinessId(String businessId, Integer page, Integer pageSize) {
        PageResult<List<CustomerApply>> result = new PageResult<>();
        List<CustomerApply> list = customerApplyDao.queryCustomerApplyByBusinessId(businessId, page, pageSize);
        result.setSuccess(true);
        result.setResult(list);
        result.setPageSize(pageSize);
        result.setPage(page);
        result.setTotal(list.size());
        return result;
    }

    @Override
    public PageResult<List<CustomerApply>> pageQueryCustomerApply(Integer page, Integer pageSize) {
        PageResult<List<CustomerApply>> result = new PageResult<>();
        List<CustomerApply> list = customerApplyDao.pageQueryCustomerApply(page, pageSize);
        result.setSuccess(true);
        result.setResult(list);
        result.setPageSize(pageSize);
        result.setPage(page);
        result.setTotal(list.size());
        return result;
    }

    @Override
    public PageResult<Boolean> insertCustomerApply(CustomerApply customerApply) {
        PageResult<Boolean> result = new PageResult<>();
        result.setSuccess(true);
        result.setResult(customerApplyDao.insertCustomerApply(customerApply));
        return result;
    }
}
