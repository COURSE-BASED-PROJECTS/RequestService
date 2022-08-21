package com.up.RequestService.service;

import com.up.RequestService.dto.HistoryDto;
import com.up.RequestService.model.Hailing;
import com.up.RequestService.repository.HailingRepository;
import com.up.RequestService.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
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

    public List<HistoryDto> findHistoryByClientId(String clientId) {
        List<HistoryDto> result = new ArrayList<>();
        List<Hailing> temp = this.findAll().stream().filter(p -> p.client_id.equals(clientId)).collect(Collectors.toList());
        RestTemplate restTemplate = new RestTemplate();

        String findClientNameUrl = "http://localhost:9090/api/account/name/";
        String findDriverNameUrl = "http://localhost:9090/api/driver/name/";
        String findAddressUrl = "http://localhost:9090/api/location/name/";
        for (int i = 0; i < temp.size(); i++) {
            Hailing hailing = temp.get(i);
            String clientName = restTemplate.getForObject(findClientNameUrl + hailing.client_id, String.class);
            String driverName = restTemplate.getForObject(findDriverNameUrl + hailing.getDriver_id(), String.class);
            String pickingAddress = restTemplate.getForObject(findAddressUrl + hailing.getPicking_address(), String.class);
            String arrivingAddress = restTemplate.getForObject(findAddressUrl + hailing.getArriving_address(), String.class);

            HistoryDto historyDto = new HistoryDto(hailing.getHailing_id(),
                    hailing.client_id, clientName, hailing.getDriver_id(), driverName,
                    hailing.getDistance(), Util.timeConverter(hailing.getTime_during()), hailing.getCost(),
                    hailing.getTime_start(), hailing.getStatus(), pickingAddress, arrivingAddress, hailing.getCar_type());
            result.add(historyDto);
        }

        return result;
    }

    public List<HistoryDto> findHistoryByDriverId(Integer driverId) {
        List<HistoryDto> result = new ArrayList<>();
        List<Hailing> temp = this.findAll().stream().filter(p -> p.driver_id == driverId).collect(Collectors.toList());
        RestTemplate restTemplate = new RestTemplate();

        String findClientNameUrl = "http://localhost:9090/api/account/name/";
        String findDriverNameUrl = "http://localhost:9090/api/driver/name/";
        String findAddressUrl = "http://localhost:9090/api/location/name/";
        for (int i = 0; i < temp.size(); i++) {
            Hailing hailing = temp.get(i);
            String clientName = restTemplate.getForObject(findClientNameUrl + hailing.client_id, String.class);
            String driverName = restTemplate.getForObject(findDriverNameUrl + hailing.getDriver_id(), String.class);
            String pickingAddress = restTemplate.getForObject(findAddressUrl + hailing.getPicking_address(), String.class);
            String arrivingAddress = restTemplate.getForObject(findAddressUrl + hailing.getArriving_address(), String.class);

            HistoryDto historyDto = new HistoryDto(hailing.getHailing_id(),
                    hailing.client_id, clientName, hailing.getDriver_id(), driverName,
                    hailing.getDistance(), Util.timeConverter(hailing.getTime_during()), hailing.getCost(),
                    hailing.getTime_start(), hailing.getStatus(), pickingAddress, arrivingAddress, hailing.getCar_type());
            result.add(historyDto);
        }

        return result;
    }

    public Hailing addNew(Hailing hailing) {
        hailing.scope = hailing.scope.toUpperCase();
        hailing.status = hailing.status.toUpperCase();
        return  hailingRepository.save(hailing);
    }
}
