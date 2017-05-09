package com.telecom.dao;

import com.telecom.model.CustomerApply;

import java.util.List;

/**
 * Created by lee on 09/05/2017.
 */
public interface CustomerApplyDao {

    List<CustomerApply> pageQueryCustomerApply(Integer page, Integer pageSize);

    List<CustomerApply> queryCustomerApplyByBusinessId(String businessId);

    Boolean insertCustomerApply(CustomerApply customerApply);
}
