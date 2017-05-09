package com.telecom.service;

import com.telecom.model.BusinessHall;
import com.telecom.model.PageResult;

/**
 * Created by lee on 09/05/2017.
 */
public interface BusinessHallService {
    PageResult<BusinessHall> getBusinessHall(long id);

    PageResult<BusinessHall> getNearestBusinessHall(Double longitude, Double latitude);
}
