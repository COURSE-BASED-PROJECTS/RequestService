package com.up.RequestService.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "passengerrequests")
public class PassengerRequest {
    @Id
    @Column(name = "passenger_id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    public Integer passengerId;

    @Column(name = "phone_number")
    public String phoneNumber;

    @Column(name = "passenger_name")
    public String passengerName;

    @Column(name = "passenger_avatar")
    public String passengerAvatar;

    @Column(name = "account_id")
    public Integer accountId;

    @Column(name = "hailing_id")
    public Integer hailing_id;



    public PassengerRequest() {
    }

    public PassengerRequest(Integer passengerId, String phoneNumber, String passengerName, String passengerAvatar, Integer accountId, Integer hailing_id) {
        this.passengerId = passengerId;
        this.phoneNumber = phoneNumber;
        this.passengerName = passengerName;
        this.passengerAvatar = passengerAvatar;
        this.accountId = accountId;
        this.hailing_id = hailing_id;
    }

    public Integer getPassengerId() {
        return passengerId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPassengerAvatar() {
        return passengerAvatar;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public Integer getHailing_id() {
        return hailing_id;
    }
}
