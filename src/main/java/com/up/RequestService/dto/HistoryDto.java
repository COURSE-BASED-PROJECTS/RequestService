package com.up.RequestService.dto;

import javax.persistence.Column;
import java.time.LocalDateTime;

public class HistoryDto {
    public Integer hailingId;
    public String clientId;
    public  String clientName;
    public Integer driverId;
    public String driverName;
    public Double distance;
    public String timeDuring;
    public Double cost;
    public LocalDateTime timeStart;
    public String status;
    public String pickingAddress;
    public String arrivingAddress;
    public Integer carType;

    public HistoryDto(Integer hailingId, String clientId, String clientName, Integer driverId, String driverName, Double distance, String timeDuring, Double cost, LocalDateTime timeStart, String status, String pickingAddress, String arrivingAddress, Integer carType) {
        this.hailingId = hailingId;
        this.clientId = clientId;
        this.clientName = clientName;
        this.driverId = driverId;
        this.driverName = driverName;
        this.distance = distance;
        this.timeDuring = timeDuring;
        this.cost = cost;
        this.timeStart = timeStart;
        this.status = status;
        this.pickingAddress = pickingAddress;
        this.arrivingAddress = arrivingAddress;
        this.carType = carType;
    }

    public Integer getHailingId() {
        return hailingId;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public Double getDistance() {
        return distance;
    }

    public String getTimeDuring() {
        return timeDuring;
    }

    public Double getCost() {
        return cost;
    }

    public LocalDateTime getTimeStart() {
        return timeStart;
    }

    public String getStatus() {
        return status;
    }

    public String getPickingAddress() {
        return pickingAddress;
    }

    public String getArrivingAddress() {
        return arrivingAddress;
    }

    public Integer getCarType() {
        return carType;
    }
}
