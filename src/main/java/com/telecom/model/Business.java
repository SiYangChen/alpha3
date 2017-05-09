package com.telecom.model;

/** 业务信息实体类
 *
 * Created by lee on 09/05/2017.
 */
public class Business {
    private long id;
    // 业务名称
    private String name;
    // 业务编码
    private String businessKey;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBusinessKey() {
        return businessKey;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }
}
