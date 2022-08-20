package com.up.RequestService.service;

import com.up.RequestService.model.Hailing;
import com.up.RequestService.repository.HailingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HailingService {
    private HailingRepository hailingRepository;

    @Autowired
    public HailingService(HailingRepository hailingRepository) {
        this.hailingRepository = hailingRepository;
    }


    public List<Hailing> findAll() {
        return hailingRepository.findAll();
    }

    public Optional<Hailing> findByHailingId(Integer hailingId) {
        return hailingRepository.findById(hailingId);
    }

    public List<Hailing> findByClientId(String clientId) {
        List<Hailing> temp = this.findAll().stream().filter(p -> p.client_id.equals(clientId)).collect(Collectors.toList());
        return temp;
    }

    public List<Hailing> findByDriverId(Integer driverId) {
        List<Hailing> temp = this.findAll().stream().filter(p -> p.driver_id == driverId).collect(Collectors.toList());
        return temp;
    }
}
