package com.up.RequestService.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "callcenterrequests")
public class CallCenterRequest {
    @Id
    @Column(name = "req_id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    public Integer reqId;

    @Column(name = "phone_number")
    public String phoneNumber;

    @Column(name = "cus_name")
    public String cusName;

    @Column(name = "cus_address")
    public String cusAddress;

    @Column(name = "car_type")
    public Integer carType;

    @Column(name = "picking_address")
    public String pickingAddress;

    @Column(name = "lng_picking_addr")
    public Double lngPicking;

    @Column(name = "lat_picking_addr")
    public Double latPicking;

    @Column(name = "request_date")
    public LocalDateTime requestDate;

    public CallCenterRequest() {
    }

    public CallCenterRequest(Integer reqId, String phoneNumber, String cusName, String cusAddress, Integer carType, String pickingAddress, Double lngPicking, Double latPicking, LocalDateTime requestDate) {
        this.reqId = reqId;
        this.phoneNumber = phoneNumber;
        this.cusName = cusName;
        this.cusAddress = cusAddress;
        this.carType = carType;
        this.pickingAddress = pickingAddress;
        this.lngPicking = lngPicking;
        this.latPicking = latPicking;
        this.requestDate = requestDate;
    }

    public Integer getReqId() {
        return reqId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCusName() {
        return cusName;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public Integer getCarType() {
        return carType;
    }

    public String getPickingAddress() {
        return pickingAddress;
    }

    public Double getLngPicking() {
        return lngPicking;
    }

    public Double getLatPicking() {
        return latPicking;
    }

    public LocalDateTime getRequestDate() {
        return requestDate;
    }
}
