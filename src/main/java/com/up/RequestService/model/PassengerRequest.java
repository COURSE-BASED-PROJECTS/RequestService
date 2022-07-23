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

    @Column(name = "picking_address")
    public String pickingAddress;

    @Column(name = "arriving_address")
    public String arrivingAddress;

    @Column(name = "lng_picking_addr")
    public Double lngPicking;

    @Column(name = "lat_picking_addr")
    public Double latPicking;

    @Column(name = "lng_arriving_address")
    public Double lngArriving;

    @Column(name = "lat_arriving_address")
    public Double latArriving;

    public PassengerRequest() {
    }

    public PassengerRequest(Integer passengerId, String phoneNumber, String passengerName, String passengerAvatar, String pickingAddress, String arrivingAddress, Double lngPicking, Double latPicking, Double lngArriving, Double latArriving) {
        this.passengerId = passengerId;
        this.phoneNumber = phoneNumber;
        this.passengerName = passengerName;
        this.passengerAvatar = passengerAvatar;
        this.pickingAddress = pickingAddress;
        this.arrivingAddress = arrivingAddress;
        this.lngPicking = lngPicking;
        this.latPicking = latPicking;
        this.lngArriving = lngArriving;
        this.latArriving = latArriving;
    }

    public Integer getPassenger_id() {
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

    public String getPickingAddress() {
        return pickingAddress;
    }

    public String getArrivingAddress() {
        return arrivingAddress;
    }

    public Double getLngPicking() {
        return lngPicking;
    }

    public Double getLatPicking() {
        return latPicking;
    }

    public Double getLngArriving() {
        return lngArriving;
    }

    public Double getLatArriving() {
        return latArriving;
    }
}
