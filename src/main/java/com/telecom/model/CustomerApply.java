package com.telecom.model;

/**  用户申请信息
 *
 * Created by lee on 09/05/2017.
 */
public class CustomerApply {
    private long id;
    // 用户名
    private String name;
    // 用户手机号
    private String phone;
    // 用户经度
    private Double longitude;
    // 用户纬度
    private Double latitude;
    // 业务编码组合
    private String businessKey;
    // 请求时间
    private String applyTime;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getBusinessKey() {
        return businessKey;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }
}
