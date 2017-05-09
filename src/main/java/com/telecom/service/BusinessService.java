package com.telecom.service;

import com.telecom.model.Business;
import com.telecom.model.PageResult;

import java.util.List;

/**
 * Created by lee on 09/05/2017.
 */
public interface BusinessService {
    PageResult<List<Business>> pageQueryBusiness(Integer page, Integer pageSize);

    PageResult<Business> getBusiness(long id);
}
