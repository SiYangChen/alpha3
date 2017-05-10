package com.telecom.service;

import com.telecom.model.CustomerApply;
import com.telecom.model.PageResult;

import java.util.List;

/**
 * Created by lee on 09/05/2017.
 */
public interface CustomerApplyServie {
    PageResult<List<CustomerApply>> pageQueryCustomerApply(Integer page, Integer pageSize);

    PageResult<List<CustomerApply>> queryCustomerApplyByBusinessId(String businessId, Integer page, Integer pageSize);

    PageResult<Boolean> insertCustomerApply(CustomerApply customerApply);
}
