package com.up.RequestService.repository;

import com.up.RequestService.model.CallCenterRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CallCenterRepository extends JpaRepository<CallCenterRequest,Integer> {
    Optional<CallCenterRequest> findByCallCenterRequestId(Integer reqId);
}
