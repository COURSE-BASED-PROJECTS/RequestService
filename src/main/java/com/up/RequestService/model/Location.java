package com.up.RequestService.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "location")
public class Location {
    @Id
    @Column(name = "location_id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    public Integer location_id;

    @Column(name = "location_name")
    public String location_name;

    @Column(name = "count")
    public Integer count;

    @Column(name = "latitude")
    public Double latitude;

    @Column(name = "longitude")
    public Double longitude;

    public Location(Integer location_id, String location_name, Integer count, Double latitude, Double longitude) {
        this.location_id = location_id;
        this.location_name = location_name;
        this.count = count;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Location() {

    }

    public Integer getLocation_id() {
        return location_id;
    }

    public String getLocation_name() {
        return location_name;
    }

    public Integer getCount() {
        return count;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
}

