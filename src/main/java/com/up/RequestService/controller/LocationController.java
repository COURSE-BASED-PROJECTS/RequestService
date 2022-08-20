package com.up.RequestService.controller;

import com.up.RequestService.model.Hailing;
import com.up.RequestService.model.Location;
import com.up.RequestService.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/location")
public class LocationController {
    private LocationService locationService;

    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping
    public ResponseEntity<List<Location>> getAllLocation() {
        return new ResponseEntity<>(locationService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Location>> getLocationById(@PathVariable("id") Integer locationId) {
        return new ResponseEntity<>(locationService.findByLocationId(locationId), HttpStatus.OK);
    }

    @GetMapping("/name/{id}")
    public ResponseEntity<String> getNameLocationById(@PathVariable("id") Integer locationId) {
        return new ResponseEntity<>(locationService.findNameByLocationId(locationId), HttpStatus.OK);
    }
}
