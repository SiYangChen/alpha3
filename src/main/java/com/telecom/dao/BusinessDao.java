package com.telecom.dao;

import com.telecom.model.Business;

import java.util.List;

/**
 * Created by lee on 09/05/2017.
 */
public interface BusinessDao {
    List<Business> pageQueryBusiness(Integer page, Integer pageSize);

    Business getBusiness(long id);

    Business getBusinessByKey(String businessKey);
}
