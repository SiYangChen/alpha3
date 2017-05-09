package com.telecom.model;

/** 营业厅实体类
 *
 * Created by lee on 09/05/2017.
 */
public class BusinessHall {
    private long id;
    // 营业厅名称
    private String name;
    // 营业厅地址
    private String address;
    // 营业厅经度
    private Double longitude;
    // 营业厅纬度
    private Double latitude;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
}
