package com.telecom.dao;

import com.telecom.model.BusinessHall;

/**
 * Created by lee on 09/05/2017.
 */
public interface BusinessHallDao {

    BusinessHall getBusinessHall(long id);

    BusinessHall getNearestBusinessHall(Double longitude, Double latitude);
}
