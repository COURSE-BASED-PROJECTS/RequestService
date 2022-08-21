package com.up.RequestService.controller;

import com.up.RequestService.dto.HistoryDto;
import com.up.RequestService.model.Hailing;
import com.up.RequestService.service.HailingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/hailing")
public class HailingController {
    private HailingService hailingService;

    @Autowired
    public HailingController(HailingService hailingService) {
        this.hailingService = hailingService;
    }

    @GetMapping
    public ResponseEntity<List<Hailing>> getAllHailing() {
        return new ResponseEntity<>(hailingService.findAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Integer> addNewHailing(@RequestBody Hailing hailing) {
        return new ResponseEntity<>(hailingService.addNew(hailing).getHailing_id(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Hailing>> getHailingById(@PathVariable("id") Integer hailingId) {
        return new ResponseEntity<>(hailingService.findByHailingId(hailingId), HttpStatus.OK);
    }

    @GetMapping("/clientHailing/{client_id}")
    public ResponseEntity<List<HistoryDto>> getHailingByClientId(@PathVariable("client_id") String clientId) {
        return new ResponseEntity<>(hailingService.findHistoryByClientId(clientId), HttpStatus.OK);
    }

    @GetMapping("/driverHailing/{driver_id}")
    public ResponseEntity<List<HistoryDto>> getHailingByDriverId(@PathVariable("driver_id") Integer driverId) {
        return new ResponseEntity<>(hailingService.findHistoryByDriverId(driverId), HttpStatus.OK);
    }
}
