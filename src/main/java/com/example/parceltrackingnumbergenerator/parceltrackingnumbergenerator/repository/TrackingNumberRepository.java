package com.example.parceltrackingnumbergenerator.parceltrackingnumbergenerator.repository;


import com.example.parceltrackingnumbergenerator.parceltrackingnumbergenerator.model.TrackingNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackingNumberRepository extends JpaRepository<TrackingNumber, Long> {
    boolean existsByTrackingNumber(String trackingNumber);
}