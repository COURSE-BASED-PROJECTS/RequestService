package com.up.RequestService.controller;

import com.up.RequestService.model.CallCenterRequest;
import com.up.RequestService.model.PassengerRequest;
import com.up.RequestService.service.CallCenterService;
import com.up.RequestService.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/request")
public class RequestController {

    private CallCenterService callCenterService;

    private PassengerService passengerService;

    @Autowired
    public RequestController(CallCenterService callCenterService, PassengerService passengerService) {
        this.callCenterService = callCenterService;
        this.passengerService = passengerService;
    }

    @GetMapping("/callcenter")
    public ResponseEntity<List<CallCenterRequest>> getAllCallCenterRequest() {
        return new ResponseEntity<>(callCenterService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/callcenter/{id}")
    public ResponseEntity<Optional<CallCenterRequest>> getCallCenterRequestById(@PathVariable("id") Integer callCenterRequest) {
        return new ResponseEntity<>(callCenterService.findByCallCenterRequestId(callCenterRequest), HttpStatus.OK);
    }

    @PostMapping("/callcenter")
    public ResponseEntity<CallCenterRequest> addNewCallCenterRequest(@RequestBody CallCenterRequest ccr) {
        return new ResponseEntity<>(callCenterService.addNew(ccr), HttpStatus.OK);
    }

    @PatchMapping("/callcenter")
    public ResponseEntity<CallCenterRequest> updateTaxi(@RequestBody CallCenterRequest ccr) {
        return new ResponseEntity<>(callCenterService.update(ccr), HttpStatus.OK);
    }

    //passengerRequest
    @GetMapping("/passenger")
    public ResponseEntity<List<PassengerRequest>> getAllPassengerRequest() {
        return new ResponseEntity<>(passengerService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/passenger/{id}")
    public ResponseEntity<Optional<PassengerRequest>> getPassengerRequestById(@PathVariable("id") Integer passengerRequest) {
        return new ResponseEntity<>(passengerService.findByPassengerRequestId(passengerRequest), HttpStatus.OK);
    }

    @PostMapping("/passenger")
    public ResponseEntity<PassengerRequest> addNewPassengerRequest(@RequestBody PassengerRequest pr) {
        return new ResponseEntity<>(passengerService.addNew(pr), HttpStatus.OK);
    }

    @PatchMapping("/passenger")
    public ResponseEntity<PassengerRequest> updateTaxi(@RequestBody PassengerRequest pr) {
        return new ResponseEntity<>(passengerService.update(pr), HttpStatus.OK);
    }
}
