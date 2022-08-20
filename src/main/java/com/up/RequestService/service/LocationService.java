package com.up.RequestService.service;

import com.up.RequestService.model.Location;
import com.up.RequestService.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
    private LocationRepository locationRepository;

    @Autowired
    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }


    public List<Location> findAll() {
        return locationRepository.findAll();
    }

    public Optional<Location> findByLocationId(Integer locationId) {
        return locationRepository.findById(locationId);
    }

    public String findNameByLocationId(Integer locationId) {
        return this.findByLocationId(locationId).get().getLocation_name();
    }
}
