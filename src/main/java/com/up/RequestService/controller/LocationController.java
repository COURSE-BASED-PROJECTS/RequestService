package com.up.RequestService.controller;

import com.up.RequestService.model.Hailing;
import com.up.RequestService.model.Location;
import com.up.RequestService.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/byLatLong")
    public ResponseEntity<Optional<Location>> getLocationByLatLong(@RequestParam("lat") Double lattitude, @RequestParam("long") Double longtitude) {
        return new ResponseEntity<>(locationService.findByLatLong(lattitude, longtitude), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Integer> addNew(@RequestBody Location location) {
        return new ResponseEntity<>(locationService.addNew(location).getLocation_id(), HttpStatus.OK);
    }
}
