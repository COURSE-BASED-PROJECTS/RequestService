package com.up.RequestService.service;

import com.up.RequestService.model.PassengerRequest;
import com.up.RequestService.repository.CallCenterRepository;
import com.up.RequestService.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerService {
    private PassengerRepository passengerRepository;

    @Autowired
    public PassengerService(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    public List<PassengerRequest> findAll() {
        return passengerRepository.findAll();
    }
    public PassengerRequest addNew(PassengerRequest ccr) {
        return passengerRepository.save(ccr);
    }

    public PassengerRequest update(PassengerRequest ccr) {
        return passengerRepository.save(ccr);
    }

    public Optional<PassengerRequest> findByPassengerRequestId(Integer passengerId) {
        return passengerRepository.findById(passengerId);
    }
}
