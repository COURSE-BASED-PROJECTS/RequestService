package com.up.RequestService.repository;

import com.up.RequestService.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;


public interface LocationRepository extends JpaRepository<Location, Integer> {
    @Query(value = "SELECT * FROM location l where l.latitude = :latitude and l.longitude = :longitude LIMIT 1", nativeQuery = true)
    Optional<Location> findByLatLong(@Param("latitude") Double lattitude, @Param("longitude") Double longtitude);
}
