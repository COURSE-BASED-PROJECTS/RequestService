package com.up.RequestService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CallCenterService {
    @Autowired
    private CallCenterService callCenterService;

    public CallCenterService(CallCenterService callCenterService) {
        this.callCenterService = callCenterService;
    }
}
