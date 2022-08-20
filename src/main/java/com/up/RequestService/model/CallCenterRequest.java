package com.up.RequestService.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
@Entity
@Table(name = "callcenterrequests")
public class CallCenterRequest {
    @Id
    @Column(name = "callcenter_id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    public Integer callcenter_id;

    @Column(name = "phone_number")
    public String phoneNumber;

    @Column(name = "cus_name")
    public String cusName;

    @Column(name = "cus_address")
    public String cusAddress;

    @Column(name = "hailing_id")
    public Integer hailing_id;

    public CallCenterRequest() {
    }

    public CallCenterRequest(Integer callcenter_id, String phoneNumber, String cusName, String cusAddress, Integer hailing_id) {
        this.callcenter_id = callcenter_id;
        this.phoneNumber = phoneNumber;
        this.cusName = cusName;
        this.cusAddress = cusAddress;
        this.hailing_id = hailing_id;
    }

    public Integer getCallcenter_id() {
        return callcenter_id;
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

    public Integer getHailing_id() {
        return hailing_id;
    }
}
