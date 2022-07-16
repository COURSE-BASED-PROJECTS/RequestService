package com.up.RequestService.repository;

import com.up.RequestService.model.CallCenterRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CallCenterRepository extends JpaRepository<CallCenterRequest,Long> {
}
