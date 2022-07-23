package com.up.RequestService.service;

import com.up.RequestService.model.CallCenterRequest;
import com.up.RequestService.repository.CallCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CallCenterService {
    private CallCenterRepository callCenterRepository;

    @Autowired
    public CallCenterService(CallCenterRepository callCenterRepository) {
        this.callCenterRepository = callCenterRepository;
    }

    public List<CallCenterRequest> findAll() {
        return callCenterRepository.findAll();
    }
    public CallCenterRequest addNew(CallCenterRequest ccr) {
        return callCenterRepository.save(ccr);
    }

    public CallCenterRequest update(CallCenterRequest ccr) {
        return callCenterRepository.save(ccr);
    }

    public Optional<CallCenterRequest> findByCallCenterRequestId(Integer reqId) {
        return callCenterRepository.findById(reqId);
    }

}
