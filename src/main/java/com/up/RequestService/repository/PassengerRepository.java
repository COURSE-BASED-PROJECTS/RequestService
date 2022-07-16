package com.up.RequestService.repository;

import com.up.RequestService.model.PassengerRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<PassengerRequest, Long> {
}
