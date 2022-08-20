package com.up.RequestService.repository;

import com.up.RequestService.model.Hailing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HailingRepository extends JpaRepository<Hailing, Integer> {
}
