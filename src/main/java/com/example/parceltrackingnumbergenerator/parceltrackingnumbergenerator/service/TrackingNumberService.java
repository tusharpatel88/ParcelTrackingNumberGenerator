package com.example.parceltrackingnumbergenerator.parceltrackingnumbergenerator.service;


import com.example.parceltrackingnumbergenerator.parceltrackingnumbergenerator.model.TrackingNumber;
import com.example.parceltrackingnumbergenerator.parceltrackingnumbergenerator.repository.TrackingNumberRepository;
import com.example.parceltrackingnumbergenerator.parceltrackingnumbergenerator.util.TrackingNumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Service
public class TrackingNumberService {

    @Autowired
    private TrackingNumberRepository repository;

    public TrackingNumber generateTrackingNumber() {
        String uniqueNumber;
        do {
            uniqueNumber = TrackingNumberGenerator.generate();
        } while (repository.existsByTrackingNumber(uniqueNumber));

        TrackingNumber tracking = new TrackingNumber();
        tracking.setTrackingNumber(uniqueNumber);
        tracking.setCreatedAt(OffsetDateTime.now());
        return repository.save(tracking);
    }
}