package com.up.RequestService.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "hailing")
public class Hailing {
    @Id
    @Column(name = "hailing_id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    public Integer hailing_id;

    @Column(name = "client_id")
    public String client_id;

    @Column(name = "driver_id")
    public Integer driver_id;

    @Column(name = "distance")
    public Double distance;

    @Column(name = "time_during")
    public Long time_during;

    @Column(name = "cost")
    public Double cost;

    @Column(name = "time_start")
    public LocalDateTime time_start;

    @Column(name = "scope")
    public String scope;

    @Column(name = "status")
    public String status;

    @Column(name = "picking_address")
    public Integer picking_address;

    @Column(name = "arriving_address")
    public Integer arriving_address;

    @Column(name = "car_type")
    public Integer car_type;

    public Hailing(Integer hailing_id, String client_id, Integer driver_id, Double distance, Long time_during, Double cost, LocalDateTime time_start, String scope, String status, Integer picking_address, Integer arriving_address, Integer car_type) {
        this.hailing_id = hailing_id;
        this.client_id = client_id;
        this.driver_id = driver_id;
        this.distance = distance;
        this.time_during = time_during;
        this.cost = cost;
        this.time_start = time_start;
        this.scope = scope;
        this.status = status;
        this.picking_address = picking_address;
        this.arriving_address = arriving_address;
        this.car_type = car_type;
    }

    public Hailing() {
    }

    public Integer getHailing_id() {
        return hailing_id;
    }

    public String getClient_id() {
        return client_id;
    }

    public Integer getDriver_id() {
        return driver_id;
    }

    public Double getDistance() {
        return distance;
    }

    public Long getTime_during() {
        return time_during;
    }

    public Double getCost() {
        return cost;
    }

    public LocalDateTime getTime_start() {
        return time_start;
    }

    public String getScope() {
        return scope;
    }

    public String getStatus() {
        return status;
    }

    public Integer getPicking_address() {
        return picking_address;
    }

    public Integer getArriving_address() {
        return arriving_address;
    }

    public Integer getCar_type() {
        return car_type;
    }
}
